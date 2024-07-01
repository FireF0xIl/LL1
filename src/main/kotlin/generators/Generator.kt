package generators

abstract class Generator {
    abstract fun generate(grammarName: String): String

    private var indent = 0

    protected fun String.escape() = replace("\\", "\\\\").replace("\"", "\\\"")

    protected fun makeIndent(lambda: () -> Unit) {
        indent++
        lambda()
        indent--
    }
    protected fun StringBuilder.appendBlankLine() {
        append(System.lineSeparator())
    }

    protected fun StringBuilder.printLine(line: String) {
        repeat(indent) {
            append("    ")
        }
        append(line)
        append(System.lineSeparator())
    }
}