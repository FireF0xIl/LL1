package forPackage

fun main(args: Array<String>) {
    assert(args.isNotEmpty())
    if (args.isEmpty()) {
        throw Exception("No input data")
    }
    println(ForParser(ForLexer(args[0].reader())).parse()) 
}
