package structures

sealed class Element {
    abstract val value: String

    data class Terminal(override val value: String) : Element()
    data class NonTerminal(override val value: String, val callAttributes: List<String>?) : Element()
}
