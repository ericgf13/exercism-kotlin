object HandshakeCalculator {

    fun calculateHandshake(input: Int): List<Signal> {
        val list = ArrayList<Signal>()
        Signal.values().forEach {
            if (input and it.binary == it.binary) list.add(it)
        }

        if (input and 0b10000 == 0b10000) list.reverse()
        return list
    }
}