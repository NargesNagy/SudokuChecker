fun main(args: Array<String>) {
    println(
        isValidSudoku(
            listOf(
                listOf('3', '2', '4', '1'),
                listOf('2', '3', '1', '4'),
                listOf('1', '4', '2', '3'),
                listOf('4', '1', '3', '2')
            )
        )
    )

}


fun isValidSudoku(list: List<List<Any>>): Boolean {

    list.forEach {
        if (!isValidRow(it)) return false
    }
    if (!isValidColumns(list)) return false
    return true
}


fun isValidRow(list: List<Any>): Boolean {
    if (list.isEmpty()) return false
    return !isDuplicated(list)
}

fun isValidColumns(list: List<List<Any>>): Boolean {
    val columnList = mutableListOf<Char>()
    val sudokuSize = list.size
    for (j in 0 until sudokuSize) {
        columnList.clear()
        for (i in list) {
            columnList.add(i[j] as Char)
        }
        if (isDuplicated(columnList)) return false
    }
    return true
}


fun isDuplicated(list: List<Any>): Boolean {
    val seen = mutableListOf<Char>()
    for (i in list) {
        if (i in seen && i != '-') return true
        seen.add(i as Char)
    }
    return false
}