import java.util.*
import kotlin.math.pow

const val EPSILON = "EPSILON"
const val EOF = "EOF"
const val UnknownToken = Int.MIN_VALUE

fun String.capitalizeFirstChar(): String {
    return replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}

fun String.recapitalizeFirstChar(): String {
    return replaceFirstChar { if (it.isUpperCase()) it.lowercase(Locale.getDefault()) else it.toString() }
}
//val factors = acc.toDouble().pow(factors(single)).toInt()
