object Atbash {

    private const val standardOrder = "abcdefghijklmnopqrstuvwxyz123456789"
    private const val cipherOrder = "zyxwvutsrqponmlkjihgfedcba123456789"

    fun encode(input: String): String {
        return input.toLowerCase().replace("[^\\w\\d]".toRegex(), "").mapIndexed { index, c ->
            val letter = cipherOrder[standardOrder.indexOf(c)]
            if (index != 0 && index % 5 == 0)
                " $letter"
            else
                letter
        }.joinToString("")
    }

    fun decode(input: String): String {
        return input.replace("\\s".toRegex(), "").map {
            standardOrder[cipherOrder.indexOf(it)]
        }.joinToString("")
    }
}