package easy

class SignOfTheProductOfAnArray {
    fun arraySign(nums: IntArray): Int {
        var product: Int = 1
        nums.forEach {
            product *= signFunc(it)
        }
        return signFunc(product)
    }

    private fun signFunc(number: Int): Int {
        if (number == 0)
            return 0
        else if (number > 0)
            return 1
        else
            return -1
    }
}