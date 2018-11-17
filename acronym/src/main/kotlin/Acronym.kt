object Acronym {

    fun generate(phrase: String): String {
        return phrase.split("[ -]".toRegex()).fold("") { acc, word ->
            acc + word[0].toUpperCase()
        }
    }
}