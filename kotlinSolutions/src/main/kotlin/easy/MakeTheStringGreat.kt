package easy

class MakeTheStringGreat {
    fun makeGood(s: String): String {
        val stringBuilder = StringBuilder(s)
        var i = 0
        while ((i < stringBuilder.length) and (i >= 0)) {
            val char = stringBuilder[i]
            if (char.isUpperCase()) {
                val indexAdd =
                    if (char.toLowerCase() == stringBuilder.getOrNull(i + 1)) 0 else if (char.toLowerCase() == stringBuilder.getOrNull(i - 1)) -1 else {
                        i++
                        continue
                    }
                stringBuilder.deleteCharAt(i)
                stringBuilder.deleteCharAt(i + indexAdd)
                i--
                continue
            }
            i++
        }
        return stringBuilder.toString()
    }
}