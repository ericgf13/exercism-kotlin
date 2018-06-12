object Prime {

    fun nth(num: Int): Int {
        require(num > 0) { "There is no zeroth prime." }
        var iteration = 2
        return generateSequence { iteration++ }.filter { n ->
            (2..n / 2).none { n % it == 0 }
        }.take(num).last()
    }
}