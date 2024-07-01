package structures

class Rule(
    var elements: List<ParseElements> = listOf(),
    var returnType: String? = null,
    var arguments: List<Pair<String, String>>? = null
) {
    fun getArgs(): String = arguments?.joinToString(", ") { "${it.first}: ${it.second}" } ?: ""
}