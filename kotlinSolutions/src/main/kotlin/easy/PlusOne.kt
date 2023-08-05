package easy

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        var resultArray = digits.clone()
        var sum = 0
        for (i in resultArray.size-1 downTo   0) {
            sum = resultArray[i] + 1
            if (sum != 10) {
                resultArray[i] = sum
                break
            } else {
                resultArray[i] = 0
            }

        }
        if (sum == 10) {
            resultArray = intArrayOf(1) + resultArray
        }
        return resultArray
    }
}