import kotlin.coroutines.experimental.suspendCoroutine
import kotlin.math.pow
import kotlin.math.sqrt

class Squares(private val number: Long) {

    fun squareOfSum(): Long =
            (0..number).toList().sum().toDouble().pow(2).toLong()

    fun sumOfSquares(): Long = (0..number).map { it * it }.sum()

    fun difference(): Long {
        return squareOfSum() - sumOfSquares()
    }
}