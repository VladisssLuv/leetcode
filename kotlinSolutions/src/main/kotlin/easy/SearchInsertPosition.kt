package easy

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val center = (left + right) / 2
            if (nums[center] == target) {
                return center
            } else if (nums[center] > target) {
                right = center - 1
            } else {
                left = center + 1
            }
        }
        return left
    }
}