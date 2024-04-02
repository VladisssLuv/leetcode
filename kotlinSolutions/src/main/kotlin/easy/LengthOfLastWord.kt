package easy

class LengthOfLastWord {
    companion object {
        fun lengthOfLastWord(s: String): Int {
            var counter: Int = 0
            var flagFirstChar: Boolean = false

            for (i in s.length - 1  downTo  0) {
                if (flagFirstChar) {
                    if (s[i] != ' ') {
                        counter++
                    } else {
                        return counter
                    }
                } else {
                    if (s[i] != ' ') {
                        counter++
                        flagFirstChar = true
                    }
                }
            }

            return counter
        }
    }
}