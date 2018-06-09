fun transcribeToRna(dna: String): String {
    val sb = StringBuilder();
    for (letter in dna.toCharArray()) {
        when (letter) {
            'C' ->  sb.append('G')
            'G' ->  sb.append('C')
            'T' ->  sb.append('A')
            'A' ->  sb.append('U')
        }
    }
    return sb.toString()
}
