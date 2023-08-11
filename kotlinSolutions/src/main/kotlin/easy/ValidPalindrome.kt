package easy

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var rigth = s.length - 1

        while (left <= rigth) {
            if (!s[left].isLetter() && !s[left].isDigit()) {
                left++
                continue
            }
            if (!s[rigth].isLetter() && !s[rigth].isDigit()) {
                rigth--
                continue
            }
            if (s[left].toLowerCase() != s[rigth].toLowerCase()) {
                return false
            }
            left++
            rigth--
        }
        return true
    }

    fun isPalindrome2(s: String): Boolean {
        val formatS = s.toLowerCase().replace(Regex("[^a-z0-9]"), "")
        var left = 0
        var rigth = formatS.length - 1

        while (left <= rigth) {
            if (formatS[left] != formatS[rigth]) {
                return false
            }
            left++
            rigth--
        }
        return true
    }
}