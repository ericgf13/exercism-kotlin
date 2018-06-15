class Matrix(matrix: List<List<Int>>) {

    val saddlePoints: Set<MatrixCoordinate>

    init {
        val maxInRow = HashSet<MatrixCoordinate>()
        for (rowIndex in matrix.indices) {
            val row = matrix[rowIndex]
            row.forEachIndexed { colIndex, num ->
                if (num == row.max())
                    maxInRow.add(MatrixCoordinate(rowIndex, colIndex))
            }
        }

        val minInCol = HashSet<MatrixCoordinate>()
        for (colIndex in matrix[0].indices) {
            val col = matrix.map { it[colIndex] }
            col.forEachIndexed { rowIndex, num ->
                if (num == col.min())
                    minInCol.add(MatrixCoordinate(rowIndex, colIndex))
            }
        }

        saddlePoints = maxInRow.intersect(minInCol)
    }
}