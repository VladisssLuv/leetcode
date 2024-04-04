package easy

class MaximumNestingDepthOfParentheses {
    fun maxDepth(s: String): Int {
        if (s.isEmpty())
            return 0

        var maxDepth = 0
        var dp = 0

        for (el in s) {
            dp += if (el == '(') 1 else if (el == ')') -1 else 0
            if(dp > maxDepth)
                maxDepth = dp
        }
        return maxDepth
    }
}