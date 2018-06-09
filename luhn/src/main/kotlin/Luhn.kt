object Luhn {

    fun isValid(input: String): Boolean {
        val number = input.replace("\\s".toRegex(), "").reversed()
        if (number.length <= 1) return false
        if (number.any { !it.isDigit() }) return false

        return number.mapIndexed { i, c ->
            if (i % 2 == 1) {
                val doubled = c.toString().toInt() * 2
                if (doubled >= 10) doubled - 9 else doubled
            } else {
                number[i]
            }
        }.sumBy { it.toString().toInt() } % 10 == 0
    }
}
