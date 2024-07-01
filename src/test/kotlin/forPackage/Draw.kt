package forPackage
import TreeDraw
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

fun dot(name : String = "example") =
    ProcessBuilder("dot", "-Tsvg", "$name.gv")
        .redirectOutput(File("$name.svg"))
        .redirectError(ProcessBuilder.Redirect.INHERIT)
        .start()
        .waitFor()
        .also {
            // delete temporary file
            Files.delete(Paths.get("$name.gv"))
        }


fun main(args: Array<String>) {
    assert(args.isNotEmpty())
    println(args.size)

    val sample = "for(int i = 1, c =4, d = 3; i < 10 && || i < 1 ^ i > 5; i ++)"
    println(sample)
    val example = ForParser(ForLexer(sample.reader())).parse()
    println(example)
    val fileName = "forExample"
    Files.newBufferedWriter(Paths.get("$fileName.gv")).use {
        TreeDraw(example, it).writeSvg()
    }.also { dot(fileName) }
}

/*

for(int i = 1; i < 4; i ++)

for (int a=0 ; a < 5 ; a++ )

for ( INIT ; CONDITION ; ITERATION )

INIT -> TYPE VAR EQ VAL
CONDITION -> VAR COMP VAL
CONDITION -> VAL COMP VAR
ITERATION -> VAR CHN
ITERATION -> CHN VAR

< > <= >= == !=

++ --

*/
