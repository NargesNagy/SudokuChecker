fun main() {

    test(
        name = "when a sudoku is valid return true",
        isValidSudoku(
            listOf(
                listOf('1', '2', '3'),
                listOf('4', '5', '6'),
                listOf('7', '8', '9')
            )
        ),
        correctResult = true
    )


    test(
        name = "when a sudoku is valid return true",
        isValidSudoku(
            listOf(
                listOf('1', '2', '3'),
                listOf('-', '5', '6'),
                listOf('7', '8', '-')
            )
        ),
        correctResult = true
    )

    test(
        name = "when a sudoku size is not valid return false",
        isValidSudoku(
            listOf(
                listOf('4', '5', '6'),
                listOf('7', '8', '9')
            )
        ),
        correctResult = false
    )

    test(
        name = "when a sudoku 3*3 char is repeated in the column return false",
        isValidSudoku(
            listOf(
                listOf('1', '2', '3'),
                listOf('4', '5', '6'),
                listOf('7', '8', '3')
            )
        ),
        correctResult = false
    )

    test(
        name = "when a sudoku 3*3 char is repeated in the column return false",
        isValidSudoku(
            listOf(
                listOf('1', '2', '3'),
                listOf('4', '5', '6'),
                listOf('7', '9', '9')
            )
        ),
        correctResult = false
    )

    test(
        name = "when a sudoku subBox is valid return false",
        isValidSudoku(
            listOf(
                listOf('3', '2', '4', '1'),
                listOf('2', '3', '1', '4'),
                listOf('1', '4', '2', '3'),
                listOf('4', '1', '3', '2')
            )
        ),
        correctResult = false
    )

    test(
        name = "when a sudoku 3*3 char is repeated in the column return false",
        isValidSudoku(
            listOf(
                listOf('3', '2', '4', '1'),
                listOf('2', '3', '1', '4'),
                listOf('1', '4', '2', '3'),
                listOf('1', '4', '3', '2')
            )
        ),
        correctResult = false
    )

    test(
        name = "when a sudoku 3*3 char is repeated in the row return false",
        isValidSudoku(
            listOf(
                listOf('3', '2', '4', '1'),
                listOf('2', '3', '1', '4'),
                listOf('1', '4', '2', '3'),
                listOf('4', '1', '3', '3')
            )
        ),
        correctResult = false
    )

    test(
        name = "when a sudoku subBox is not valid return false",
        isValidSudoku(
            listOf(
                listOf('6', '1', '4', '3', '2', '5'),
                listOf('1', '3', '2', '6', '5', '4'),
                listOf('4', '6', '3', '5', '1', '2'),
                listOf('2', '4', '5', '1', '3', '6'),
                listOf('3', '5', '6', '2', '4', '1'),
                listOf('5', '2', '1', '4', '6', '3')
            )
        ),
        correctResult = false
    )

    test(
        name = "when a 6*6 sudoku char is repeated in the column return false",
        isValidSudoku(
            listOf(
                listOf('6', '1', '4', '3', '2', '5'),
                listOf('1', '3', '2', '6', '5', '4'),
                listOf('4', '6', '3', '5', '1', '2'),
                listOf('2', '4', '5', '1', '3', '6'),
                listOf('3', '5', '6', '2', '4', '1'),
                listOf('5', '1', '2', '4', '6', '3')
            )
        ),
        correctResult = false
    )


    test(
        name = "when a 9*9 sudoku is valid return true",
        isValidSudoku(
            listOf(
                listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                listOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                listOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        correctResult = true
    )


    test(
        name = "when a 9*9 sudoku char is repeated in the row return false",
        isValidSudoku(

            listOf(
                listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                listOf('1', '9', '8', '3', '4', '2', '5', '6', '1'),
                listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                listOf('5', '2', '6', '8', '5', '3', '7', '9', '1'),
                listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                listOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        correctResult = false
    )
    test(
        name = "when a 16*16 sudoku is valid return true",
        isValidSudoku(

            listOf(
                listOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g'),
                listOf('5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', '1', '2', '3', '4'),
                listOf('9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', '1', '2', '3', '4', '5', '6', '7', '8'),
                listOf('d', 'e', 'f', 'g', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c'),
                listOf('2', '1', '4', '3', '6', '5', '8', '7', 'a', '9', 'c', 'b', 'e', 'd', 'g', 'f'),
                listOf('6', '5', '8', '7', 'a', '9', 'c', 'b', 'e', 'd', 'g', 'f', '2', '1', '4', '3'),
                listOf('a', '9', 'c', 'b', 'e', 'd', 'g', 'f', '2', '1', '4', '3', '6', '5', '8', '7'),
                listOf('e', 'd', 'g', 'f', '2', '1', '4', '3', '6', '5', '8', '7', 'a', '9', 'c', 'b'),
                listOf('3', '4', '1', '2', '7', '8', '5', '6', 'b', 'c', '9', 'a', 'f', 'g', 'd', 'e'),
                listOf('7', '8', '5', '6', 'b', 'c', '9', 'a', 'f', 'g', 'd', 'e', '3', '4', '1', '2'),
                listOf('b', 'c', '9', 'a', 'f', 'g', 'd', 'e', '3', '4', '1', '2', '7', '8', '5', '6'),
                listOf('f', 'g', 'd', 'e', '3', '4', '1', '2', '7', '8', '5', '6', 'b', 'c', '9', 'a'),
                listOf('4', '3', '2', '1', '8', '7', '6', '5', 'c', 'b', 'a', '9', 'g', 'f', 'e', 'd'),
                listOf('8', '7', '6', '5', 'c', 'b', 'a', '9', 'g', 'f', 'e', 'd', '4', '3', '2', '1'),
                listOf('c', 'b', 'a', '9', 'g', 'f', 'e', 'd', '4', '3', '2', '1', '8', '7', '6', '5'),
                listOf('g', 'f', 'e', 'd', '4', '3', '2', '1', '8', '7', '6', '5', 'c', 'b', 'a', '9')
            )
        ),
        correctResult = true
    )


    test(
        name = "when a 16*16 sudoku is not valid return false",
        isValidSudoku(

            listOf(
                listOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
                listOf('B', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'C', 'D', 'E', 'F', 'G'),
                listOf('C', 'B', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'D', 'E', 'F', 'G'),
                listOf('D', 'C', 'B', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'E', 'F', 'G'),
                listOf('E', 'D', 'C', 'B', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'F', 'G'),
                listOf('F', 'E', 'D', 'C', 'B', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'G'),
                listOf('G', 'F', 'E', 'D', 'C', 'B', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A'),
                listOf('1', 'G', 'F', 'E', 'D', 'C', 'B', '2', '3', '4', '5', '6', '7', '8', '9', 'A'),
                listOf('2', '1', 'G', 'F', 'E', 'D', 'C', 'B', '3', '4', '5', '6', '7', '8', '9', 'A'),
                listOf('3', '2', '1', 'G', 'F', 'E', 'D', 'C', 'B', '4', '5', '6', '7', '8', '9', 'A'),
                listOf('4', '3', '2', '1', 'G', 'F', 'E', 'D', 'C', 'B', '5', '6', '7', '8', '9', 'A'),
                listOf('5', '4', '3', '2', '1', 'G', 'F', 'E', 'D', 'C', 'B', '6', '7', '8', '9', 'A'),
                listOf('6', '5', '4', '3', '2', '1', 'G', 'F', 'E', 'D', 'C', 'B', '7', '8', '9', 'A'),
                listOf('7', '6', '5', '4', '3', '2', '1', 'G', 'F', 'E', 'D', 'C', 'B', '8', '9', 'A'),
                listOf('8', '7', '6', '5', '4', '3', '2', '1', 'G', 'F', 'E', 'D', 'C', 'B', '9', 'A'),
                listOf('9', '8', '7', '6', '5', '4', '3', '2', '1', 'G', 'F', 'E', 'D', 'C', 'B', 'A')
            )
        ),
        correctResult = false
    )


}

fun test(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success $name $result")
        return
    }
    println("Fail $name $result")
}

