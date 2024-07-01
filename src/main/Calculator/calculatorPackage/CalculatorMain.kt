package calculatorPackage

fun main(args: Array<String>) {
    assert(args.isNotEmpty())
    if (args.isEmpty()) {
        throw Exception("No input data")
    }
    println(CalculatorParser(CalculatorLexer(args[0].reader())).parse()) 
}
