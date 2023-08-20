package easy

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        var sum = ((0 + nums.size) / 2.0) * nums.size + 1

        for (num in nums) {
            sum -= num
        }

        return sum.toInt()
    }
}