class Triangle(side1: Double, side2: Double, side3: Double) {

    private val sides = setOf(side1, side2, side3)
    private val sortedSides = listOf(side1, side2, side3).sorted()

    val isEquilateral = sides.size == 1
    val isIsosceles = sides.size <= 2
    val isScalene = sides.size == 3
    val isDegenerate = sortedSides[0] + sortedSides[1] == sortedSides[2]

    init {
        require(side1 > 0 && side2 > 0 && side3 > 0)
        require(sortedSides[0] + sortedSides[1] >= sortedSides[2])
    }

    constructor(side1: Int, side2: Int, side3: Int) : this(side1.toDouble(), side2.toDouble(), side3.toDouble())

}