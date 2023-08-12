package easy

class FindTheDifference {
    fun findTheDifference(s: String, t: String): Char {
        val charArrayTemp: CharArray = s.toCharArray()

        for (char in t) {
            val index = charArrayTemp.indexOf(char)
            if (index == -1) {
                return char
            }
            charArrayTemp[index] = '-'
        }
        return ' '
    }
}