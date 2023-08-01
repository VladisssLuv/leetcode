package easy

class BinaryTreePostorderTraversal {
    private val listResult: MutableList<Int>

    init {
        listResult = mutableListOf<Int>()
    }

    companion object {
        class TreeNode(var `val`: Int) {
            var left: TreeNode? = null
            var right: TreeNode? = null
        }
    }

    fun postorderTraversal(root: TreeNode?): List<Int> {
        helper(root)
        return listResult
    }

    private fun helper(node: TreeNode?) {
        if(node == null)
            return
        helper(node.left)
        helper(node.right)
        listResult.add(node.`val`)
    }
}