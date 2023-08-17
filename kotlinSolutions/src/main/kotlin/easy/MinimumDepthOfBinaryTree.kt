package easy

class MinimumDepthOfBinaryTree {
    class TreeNode(var `val`: Int) {
            var left: TreeNode? = null
            var right: TreeNode? = null
    }
    var min: Int = Int.MAX_VALUE

    fun minDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        helper(root, 2)

        return min
    }

    private fun helper(node: TreeNode?, count: Int) {
        if (node == null) {
            return
        }
        if (node.left == null && node.right == null && min > count) {
            min = count
        } else {
            helper(node.left, count + 1)
            helper(node.right, count + 1)
        }
    }
}