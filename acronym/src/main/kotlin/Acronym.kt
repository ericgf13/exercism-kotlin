object Acronym {

    fun generate(phrase: String): String {
        var acronym = StringBuilder()
        for (word in phrase.split("[ -]".toRegex())) {
            acronym.append(word[0].toUpperCase())
        }
        return acronym.toString()
    }
}