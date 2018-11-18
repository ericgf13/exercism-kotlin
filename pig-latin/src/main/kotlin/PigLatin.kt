object PigLatin {

    private const val ay = "ay"
    private const val qu = "qu"

    fun translate(input: String): String {
        return input.split(" ").joinToString(" ") {
            when {
                isVowel(it.first()) || listOf('x', 'y').contains(it.first()) && !isVowel(it[1]) -> it + ay
                it.take(2) == qu -> it.substring(2) + it.take(2) + ay
                it.length >= 3 && it.substring(1, 3) == qu -> it.substring(3) + it.take(3) + ay
                else -> {
                    val consonantSize = consonantSize(it)
                    it.substring(consonantSize) + it.take(consonantSize) + ay
                }
            }
        }
    }

    private fun isVowel(c: Char): Boolean = listOf('a', 'e', 'i', 'o', 'u').contains(c)

    private fun consonantSize(input: String): Int = input.indices.find {
        isVowel(input[it]) || (it != 0 && input[it] == 'y')
    } ?: input.length
}
