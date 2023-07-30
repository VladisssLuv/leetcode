package easy

class CountingBits {
    fun countBits(n: Int): IntArray {
        val resultArray: IntArray = IntArray(n+1)

        for (i: Int in 0 ..  n) {
            var countOnes = 0
            i.toString(2).forEach {
                if (it == '1') {
                    countOnes++
                }
            }
            resultArray[i] = countOnes
        }

        return resultArray
    }
}