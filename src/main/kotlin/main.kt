import generators.LexerGenerator
import generators.MainGenerator
import generators.ParserGenerator
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.File


fun main() {
    File("src/main/kotlin/grammars").walk().forEach {
        if (it.isFile) {
            val collector = GrammarListener()
            ParseTreeWalker().walk(
                collector,
                GrammarParserParser(CommonTokenStream(GrammarParserLexer(CharStreams.fromFileName(it.absolutePath)))).file()
            )
            val d =
                File("src/main/${it.nameWithoutExtension}/${it.nameWithoutExtension.recapitalizeFirstChar()}Package")
            if (!d.exists()) {
                d.mkdir()
            }
            File("src/main/${it.nameWithoutExtension}/${it.nameWithoutExtension.recapitalizeFirstChar()}Package/${it.nameWithoutExtension.capitalizeFirstChar()}Parser.kt").printWriter()
                .use { out ->
                    out.print(ParserGenerator(collector).generate(it.nameWithoutExtension))
                }
            File("src/main/${it.nameWithoutExtension}/${it.nameWithoutExtension.recapitalizeFirstChar()}Package/${it.nameWithoutExtension.capitalizeFirstChar()}Lexer.kt").printWriter()
                .use { out ->
                    out.print(LexerGenerator(collector).generate(it.nameWithoutExtension))
                }
            File("src/main/${it.nameWithoutExtension}/${it.nameWithoutExtension.recapitalizeFirstChar()}Package/${it.nameWithoutExtension.capitalizeFirstChar()}Main.kt").printWriter()
                .use { out ->
                    out.print(MainGenerator().generate(it.nameWithoutExtension))
                }
        }
    }
}