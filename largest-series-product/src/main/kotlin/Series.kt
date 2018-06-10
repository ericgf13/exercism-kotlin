class Series(private val input: String) {

    init {
        require(input.all { it.isDigit() })
    }

    fun getLargestProduct(span: Int): Int {
        require(span >= 0 && span <= input.length)

        if (span == 0) return 1

        return input.map { it.toString().toInt() }.windowed(span) {
            it.reduce { acc, s -> acc * s }
        }.max() ?: 0
    }
}