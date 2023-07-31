package easy

class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        mySecondSolution(nums)
    }

    private fun myFirsSolution(nums: IntArray) {
        if (nums.size <= 1) {
            return
        }
        var cursorForNotZero = 0
        var cursorForZero = 0

        while (cursorForNotZero < nums.size) {
            if (nums[cursorForNotZero] != 0 && nums[cursorForZero] == 0) {
                val temp = nums[cursorForNotZero]
                nums[cursorForNotZero] = nums[cursorForZero]
                nums[cursorForZero] = temp
            }
            if (nums[cursorForNotZero] == 0 || cursorForNotZero == cursorForZero) {
                cursorForNotZero++
            }
            if (nums[cursorForZero] != 0) {
                cursorForZero++
            }
        }
    }

    private fun mySecondSolution(nums: IntArray) {
        if (nums.size <= 1) {
            return
        }
        var cursor = 0

        for(i in 0 until nums.size) {
            if (nums[i] != 0) {
                if (cursor != i) {
                    val temp = nums[i]
                    nums[i] = nums[cursor]
                    nums[cursor] = temp
                }
                cursor++
            }
        }
    }
}