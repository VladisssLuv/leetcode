package easy

class IsomorphicStrings {
    companion object {
        fun isIsomorphic(s: String, t: String): Boolean {
            val map: MutableMap<Char, Char> = mutableMapOf()

            for (i in s.indices) {
                if (!map.containsKey(s[i]) and !map.containsValue(t[i])) {
                    map[s[i]] = t[i]
                } else {
                    if(map[s[i]] != t[i]) {
                        return false
                    }
                }
            }

            return true
        }
    }
}