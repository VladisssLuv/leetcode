package easy

class RemoveAllAdjacentDuplicatesInString {
    fun removeDuplicates(s: String): String {
        val stack: MutableList<Char> = mutableListOf()

        for (char in s) {
            if (stack.isEmpty() || stack.last() != char) {
                stack.add(char)
            } else {
                stack.removeAt(stack.lastIndex)
            }
        }

        return stack.joinToString("")
    }

    fun removeDuplicates2(s: String): String {
        val resultString: StringBuilder = StringBuilder(s)
        var cursor: Int = 0

        while (cursor < resultString.length - 1) {
            if (resultString[cursor] == resultString[cursor + 1]) {
                resultString.delete(cursor, cursor + 2)
                if (cursor != 0) {
                    cursor--
                }
                continue
            }
            cursor++
        }

        return resultString.toString()
    }
}