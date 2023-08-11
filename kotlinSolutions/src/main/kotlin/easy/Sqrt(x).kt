package easy

class `Sqrt(x)` {
    fun mySqrt(x: Int): Int {
        if (x == 1)
            return 1

        var left = 1L
        var right = x / 2L
        var temp = 0L
        while (left <= right) {
            val center = (left + right) / 2L
            val squareCenter = center * center
            if (squareCenter == x.toLong()) {
                return center.toInt()
            } else if (squareCenter < x) {
                left = center + 1
                temp = center
            } else {
                right = center - 1
            }
        }
        return temp.toInt()
    }
}