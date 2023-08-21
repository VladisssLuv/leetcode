package easy

class BinaryTreePaths {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
    private var result: MutableList<String> = mutableListOf()

    fun binaryTreePaths(root: TreeNode?): List<String> {
        dfs(root, StringBuilder())
        return result
    }

    private fun dfs(node: TreeNode?, path: StringBuilder) {
        if (node == null) {
            return
        }

        path.also {
            if (node.left == null && node.right == null) {
                result.add(
                    path.toString() + node.`val`.toString()
                )
                return@dfs
            }
            it.append(node.`val`)
            it.append("->")
        }

        dfs(node.left, StringBuilder(path))
        dfs(node.right, StringBuilder(path))
    }
}