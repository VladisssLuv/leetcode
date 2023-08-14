package easy

class ReverseWordsInAStringIII {
    fun reverseWords(s: String): String {
        val stringBuilder: StringBuilder = StringBuilder()
        var endPointer: Int = 0

        for (i in 0 until  s.length) {
            if (i == s.length - 1) {
                stringBuilder.append(s.substring(endPointer .. i).reversed())
                break
            }
            if (s[i] != ' ') {
                continue
            } else {
                stringBuilder.append(s.substring(endPointer until i).reversed())
                stringBuilder.append(s[i])
                endPointer = i + 1
            }
        }
        return stringBuilder.toString()
    }
}