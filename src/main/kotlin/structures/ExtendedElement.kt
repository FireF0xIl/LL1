package structures

sealed class ExtendedElement {
    data class Code(val value: String) : ExtendedElement()
    data class Sample(val element: Element) : ExtendedElement()
}
