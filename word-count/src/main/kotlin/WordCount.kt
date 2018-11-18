object WordCount {
    fun phrase(input: String): Map<String, Int> {
        return input.toLowerCase()
                .split(Regex("[^\\d\\w']+"))
                .filter { it.isNotEmpty() }
                .map {
                    if (it.startsWith("'")) it.substring(1, it.length - 1) else it
                }.groupBy { it }.mapValues { it.value.size }
    }
}