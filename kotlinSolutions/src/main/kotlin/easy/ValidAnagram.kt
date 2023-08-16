package easy

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val hashMapForS: HashMap<Char, Int> = hashMapOf()
        val hashMapForT: HashMap<Char, Int> = hashMapOf()

        for (i in 0 until  s.length) {
            hashMapForS[s[i]] = (hashMapForS[s[i]] ?: 0) + 1
            hashMapForT[t[i]] = (hashMapForT[t[i]] ?: 0) + 1
        }
        return hashMapForS == hashMapForT
    }
}