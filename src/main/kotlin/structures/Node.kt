package structures

data class Node(val name: String, val children: List<Node> = listOf()) {
    constructor(name: String, child: String) : this(name, listOf(Node(child)))
//    constructor<T>(name: String, children: List<T>) {
//
//    }
//    constructor(name: Token, children: List<structures.Node> = listOf()) : this(name.toString(), children)
//    constructor(name: Token, child: String) : this(name.toString(), listOf(structures.Node(child)))
}