package easy

class AddDigits {
    fun addDigits(num: Int): Int {
        if (num % 9 == 0 && num != 0)
            return 9
        return num % 9
    }
}