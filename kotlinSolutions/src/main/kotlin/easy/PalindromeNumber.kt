package src.main.kotlin.easy

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0)
            return false

        var isNotLast = true
        var divNumber: Long = 1
        var flipNumber: Long = 0
        while (isNotLast) {
            if ((x / (divNumber * 10)) == 0L) {
                isNotLast = false
            }
            flipNumber = flipNumber * 10 + ((x % (divNumber * 10)) / divNumber)
            divNumber *= 10
        }
        return flipNumber == x.toLong()
    }
}