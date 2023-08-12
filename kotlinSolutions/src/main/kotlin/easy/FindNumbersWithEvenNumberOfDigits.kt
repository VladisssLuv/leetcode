package easy

class FindNumbersWithEvenNumberOfDigits {
    fun findNumbers(nums: IntArray): Int {
        var countEvenNums = 0
        for (num in nums) {
            if (num == 0) {
                continue
            }
            var countDigits = 0
            var tempNum = num
            while (tempNum > 0) {
                tempNum /= 10
                countDigits++
            }
            if (countDigits % 2 == 0) {
                countEvenNums++
            }
        }
        return countEvenNums
    }

    fun findNumbers2(nums: IntArray): Int {
        var countEvenNums = 0
        for (num in nums) {
            if(num.toString().length % 2 == 0) {
                countEvenNums++
            }
        }
        return countEvenNums
    }
}