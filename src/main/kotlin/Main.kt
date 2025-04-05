import kotlin.math.sqrt

fun main(args: Array<String>) {
    println(
        isValidBox(
            listOf(
                listOf('3', '2', '4', '1'),
                listOf('5', '6', '1', '4'),
                listOf('9', '4', '2', '3'),
                listOf('4', '1', '3', '2')
            ), 2
        )
    )

}


fun isValidSudoku(list: List<List<Any>>): Boolean {

    list.forEach {
        if (!isValidRow(it)) return false
    }
    if (!isValidColumns(list)) return false
    val squareRoot = sqrt(list.size.toDouble()).toInt()
    return isValidBox(list, squareRoot)
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

fun isValidBox(list: List<List<Any>>, boxSize: Int): Boolean{
    for (row in list.indices step boxSize){ // start row
        for (col in list.indices step boxSize){ // start col
            val subBox = mutableListOf<Char>()
            for (j in 0 until boxSize){
                for (i in 0 until boxSize){
                    val item = list[row+j][col+i]
                    if (item != '-' &&  subBox.contains(item)) return false
                    subBox.add(item as Char)
                }

            }
        }

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