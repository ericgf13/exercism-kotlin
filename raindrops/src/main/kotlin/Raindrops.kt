object Raindrops {

    fun convert(input: Int): String {
        val output = StringBuilder()
        if (input % 3 == 0) {
            output.append("Pling")
        }
        if (input % 5 == 0) {
            output.append("Plang")
        }
        if (input % 7 == 0) {
            output.append("Plong")
        }

        return if (output.isEmpty()) input.toString() else output.toString()
    }
}