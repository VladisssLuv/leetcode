package easy

class MaximumProductOfTwoElementsInAnArray {
    fun maxProduct(nums: IntArray): Int {
        var maxFist = Int.MIN_VALUE
        var maxSecond = Int.MIN_VALUE

        nums.forEach {
            if (it >= maxFist) {
                maxSecond = maxFist
                maxFist = it
            } else if (it > maxSecond){
                maxSecond = it
            }
        }
        return (maxFist - 1) * (maxSecond - 1)
    }
}