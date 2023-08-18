package easy

class BackspaceStringCompare {
    fun backspaceCompare(s: String, t: String): Boolean {
        var pointer = 0
        val textS: StringBuilder = StringBuilder()
        val textT: StringBuilder = StringBuilder()

        while (pointer < s.length || pointer < t.length) {
            s.getOrNull(pointer)?.also {
                if (it != '#') {
                    textS.append(it)
                } else if (textS.isNotEmpty()){
                    textS.deleteCharAt(textS.length - 1)
                }
            }
            t.getOrNull(pointer)?.also {
                if (it != '#') {
                    textT.append(it)
                } else if (textT.isNotEmpty()) {
                    textT.deleteCharAt(textT.length - 1)
                }
            }

            pointer++
        }

        return textS.toString() == textT.toString()
    }
}