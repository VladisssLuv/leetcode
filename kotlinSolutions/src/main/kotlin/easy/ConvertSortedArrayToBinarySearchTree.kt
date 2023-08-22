package easy

class ConvertSortedArrayToBinarySearchTree {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
    var root: TreeNode? = null

    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        val centerPointer: Int =  nums.size / 2
        var rightPartPointer: Int = nums.size - 1
        val leftPartPointer: Int = centerPointer - 1
        root = TreeNode(nums[centerPointer])

        helper(0, centerPointer - 1, nums)
        helper(centerPointer + 1, nums.size - 1, nums)

        return root
    }

    private fun helper(left: Int, right: Int, numsArray: IntArray) {
        if (left > right) {
            return
        }
        val center = (left + right) / 2
        addToTreeNode(numsArray[center])

        helper(center + 1, right, numsArray)
        helper(left, center - 1, numsArray)
    }

    private fun addToTreeNode(`val`: Int) {
        var iterator: TreeNode?  = root!!

        while (iterator != null) {
            if (`val` > iterator.`val`) {
                if (iterator.right == null) {
                    iterator.right = TreeNode(`val`)
                    return
                }
                iterator = iterator.right
            } else {
                if (iterator.left == null) {
                    iterator.left = TreeNode(`val`)
                    return
                }
                iterator = iterator.left
            }
        }
    }
}