object Sieve {

    fun primesUpTo(limit: Int): List<Int> {
        if (limit < 2) return emptyList()

        val numList = (2..limit).toMutableList()

        var index = 0
        var nextNum = numList[index]
        while (nextNum < limit / 2) {
            numList.removeAll((nextNum..limit / 2).map { nextNum * it })
            nextNum = numList[++index]
        }

        return numList
    }
}