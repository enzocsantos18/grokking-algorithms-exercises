package search

class BinarySearch {
    companion object {
        fun find(list: List<Int>, element: Int): Int? {
            println("list: $list")
            println("requested element: $element")
            var execution = 1
            var firstIndex = 0
            var lastIndex = list.lastIndex
            while (firstIndex <= lastIndex) {
                println("execution number ${execution++}")
                val middle = (firstIndex + lastIndex) / 2
                val take = list[middle]

                println("middle: $middle, first: $firstIndex, last:$lastIndex :: value: $take")
                if (take == element) {
                    return element
                }
                if (take > element)
                    lastIndex = middle - 1
                else
                    firstIndex = middle + 1

            }
            return  null
        }
    }

}

fun main() {
    val elements = IntArray(100) { it }.toList()
    BinarySearch.find(elements, (1..100).random())
}