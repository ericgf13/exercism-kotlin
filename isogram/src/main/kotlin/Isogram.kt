object Isogram {

    fun isIsogram(input: String): Boolean {
        return input.filterIndexed { index, c ->
            c.isLetter() && input.indexOf(c, index + 1, true) != -1
        }.none()
    }
}