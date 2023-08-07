package easy

class CheckIfNAndItsDoubleExist {
    fun checkIfExist(arr: IntArray): Boolean {
        val seen: HashSet<Int> = hashSetOf()

        for(el in arr) {
            if (seen.contains(el*2) || (el % 2 == 0 && seen.contains(el / 2))) {
                return true
            }
            seen.add(el)
        }
        return false
    }
}