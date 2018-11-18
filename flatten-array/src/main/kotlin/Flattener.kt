object Flattener {

    fun flatten(input: List<Any?>): List<Int> {
        return input.filterNotNull().flatMap {
            when (it) {
                is Int -> listOf(it)
                else -> flatten(it as List<Any?>)
            }
        }
    }
}