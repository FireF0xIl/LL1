import java.io.Reader

open class Lexer(reader: Reader, literals: Map<Int, String>, regex: Map<Int, Regex>, private val skipTokens: Set<Int>) {
    val tokens = literals.mapValues { Regex.escape(it.value).toRegex() } + regex + (UnknownToken to Regex(".+"))
    private val groups = mutableMapOf<Int, Int>()
    private var group = 0
    private val tokenRegex = tokens.map { (key, value) ->
        groups[group++] = key
        "($value)"
    }.joinToString("|").toRegex()
    private val stream: Iterator<Triple<Int, Int, String>>

    var position = -1
        private set
    var token = -1
        private set

    var tokenValue: String? = null
        private set

    init {
        val text = reader.readText()
        stream = tokenRegex.findAll(text)
            .map {
                it.groups.mapIndexedNotNull { index, group ->
                    if (index == 0 || group == null) null else Triple(index, group.range.first, group.value)
                }.singleOrNull() ?: throw IllegalStateException()
            }.iterator()
        }


    private fun getNext() {
        if (!stream.hasNext()) {
            if (token == -1) {
                throw IllegalStateException("No more tokens")
            } else {
                token = -1
                tokenValue = null
            }
        } else {
            val (index, position, value) = stream.next()
            token = groups.getValue(index - 1)
            tokenValue = value
            this.position = position
            if (token == UnknownToken) {
                throw IllegalStateException("Unknown token: $value")
            }
        }
    }

    fun next() {
        getNext()
        while (token in skipTokens) {
            getNext()
        }
    }
}