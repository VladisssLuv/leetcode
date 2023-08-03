package easy

class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) {
            return true
        }
        var cursorS = 0
        for (char in t) {
            if (char == s[cursorS]) {
                cursorS++
                if ( cursorS == s.length) {
                    return true
                }
            }

        }
        return false
    }
}