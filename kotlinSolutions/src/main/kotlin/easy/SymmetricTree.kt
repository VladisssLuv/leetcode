package easy

class SymmetricTree {
    private var leftString: String = ""
    private var rightString: String = ""
    companion object {
        class TreeNode(var `val`: Int) {
            var left: TreeNode? = null
            var right: TreeNode? = null
        }
    }

    fun isSymmetric(root: TreeNode?): Boolean {
        helper(root?.left, isRight = false)
        helper(root?.right, isRight = true)

        return leftString == rightString
    }

    private fun helper(node: TreeNode?, isRight: Boolean) {
        if (node == null) {
            if (isRight) {
                leftString += "n"
            } else {
                rightString = "n" + rightString
            }
            return
        }

        helper(node.left, isRight = false)
        if (isRight) {
            leftString += node.`val`.toString()
        } else {
            rightString = node.`val`.toString() + rightString
        }
        helper(node.right, isRight = true)
    }
}