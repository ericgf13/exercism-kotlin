import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(maxSquare: Int): BigInteger {
        require(maxSquare in 1..64) { "Only integers between 1 and 64 (inclusive) are allowed" }
        return BigInteger.valueOf(2).pow(maxSquare - 1)
    }

    fun getTotalGrainCount(): BigInteger {
        return BigInteger.valueOf(2).pow(64) - BigInteger.ONE
    }
}