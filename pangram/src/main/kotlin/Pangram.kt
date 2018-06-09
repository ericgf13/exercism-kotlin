object Pangram {

    fun isPangram(word: String): Boolean {
        val letters: HashSet<Char> = HashSet()
        for (letter in word) {
            if (letter.toLowerCase() in 'a'..'z') {
                letters.add(letter.toLowerCase())
            }
        }
        return letters.size == 26
    }
}