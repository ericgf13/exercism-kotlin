class DiamondPrinter {

    private val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    fun printToList(letter: Char): List<String> {
        val letterIndex = alphabet.indexOf(letter)

        val list = (0..letterIndex).map {
            if (it == 0)
                " ".repeat(letterIndex) + 'A' + " ".repeat(letterIndex)
            else
                " ".repeat(letterIndex - it) + alphabet[it] + " ".repeat(it * 2 - 1) +
                        alphabet[it] + " ".repeat(letterIndex - it)
        }.toMutableList()

        list.addAll(list.reversed())
        list.removeAt(list.size / 2)
        return list
    }
}
