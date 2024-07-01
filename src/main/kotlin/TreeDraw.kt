import structures.Node
import java.io.BufferedWriter

class TreeDraw(private val tree: Node, private val writer: BufferedWriter, private val name: String = "") {

    fun writeSvg() {
        writer.writeWithNewLine("digraph $name {")
        bfs()
        writer.writeWithNewLine("}")
    }

    private fun BufferedWriter.writeWithNewLine(string: String) {
        write(string)
        newLine()
    }

    private fun getId(node: Node) = "node" + System.identityHashCode(node)

    private fun bfs() {
        val queue = ArrayDeque<Node>()
        queue.add(tree)
        while (queue.isNotEmpty()) {
            val cur = queue.removeFirst()
            writer.writeWithNewLine("${getId(cur)}[label=\"${cur.name}\"]")
            if (cur.children.isNotEmpty()) {
                writer.writeWithNewLine(
                    "${getId(cur)} -> {${
                        cur.children.joinToString(
                            separator = " ",
                            transform = ::getId
                        )
                    }}")
            }
            queue.addAll(cur.children)
        }
    }
}