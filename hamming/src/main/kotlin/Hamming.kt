object Hamming {

    fun compute(strand1: String, strand2: String): Int {
        if (strand1.length != strand2.length) {
            throw IllegalArgumentException("left and right strands must be of equal length.")
        }

        var result = 0;
        for (i in strand1.indices) {
            if (strand1[i] != strand2[i]) {
                result++
            }
        }
        return result
    }
}
