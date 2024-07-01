package structures

data class ParseElements(val elements: List<Element>, val extended: List<ExtendedElement>) : List<Element> by elements
