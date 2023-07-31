package easy

class MaximumAverageSubarrayI {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var max = Int.MIN_VALUE
        var summary = 0
        var tempK = k
        var indexOfMinusElem = 0

        for(i in 0 until  nums.size) {
            if (tempK != 0) {
                summary += nums[i]
                tempK--
            } else {
                if (summary > max) {
                    max = summary
                }
                summary -= nums[indexOfMinusElem]
                summary += nums[i]
                indexOfMinusElem++
            }
        }
        if (summary > max) {
            max = summary
        }

        return max / k.toDouble()
    }
}