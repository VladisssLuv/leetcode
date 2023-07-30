package easy

class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        return !(nums.size == nums.toSet().size)
    }
}