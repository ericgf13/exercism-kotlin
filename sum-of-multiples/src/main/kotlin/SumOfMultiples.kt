object SumOfMultiples {

    fun sum(set: Set<Int>, upTo: Int): Int {
        return (1 until upTo).filter { num ->
            set.any { num % it == 0 }
        }.sum()
    }
}