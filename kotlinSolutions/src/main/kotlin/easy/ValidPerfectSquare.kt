package easy

class ValidPerfectSquare {
    fun isPerfectSquare(num: Int): Boolean {
        if (num == 1)
            return true

        var left = 1L
        var right = num / 2L

        while (left <= right) {
            val center = (left + right) / 2L
            val squareCenter = center * center
            if (squareCenter == num.toLong()) {
                return true
            } else if (squareCenter < num) {
                left = center + 1
            } else {
                right = center - 1
            }
        }
        return false
    }
}