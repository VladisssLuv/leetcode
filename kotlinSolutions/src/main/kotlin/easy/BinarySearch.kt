package easy

class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val center = (right + left) / 2
            if (nums[center] == target) {
                return center
            } else if (nums[center] > target) {
                right = center - 1
            } else {
                left = center + 1
            }

        }
        return -1
    }
}