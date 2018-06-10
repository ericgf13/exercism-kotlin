object CollatzCalculator {

    fun computeStepCount(input: Int): Int {
        require(input > 0) { "Only natural numbers are allowed" }

        var num = input
        var steps = 0
        while (num != 1) {
            when {
                num % 2 == 0 -> num /= 2
                else -> num = 3 * num + 1
            }
            steps++
        }
        return steps
    }
}