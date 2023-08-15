package easy

class GuessNumberHigherOrLower {
    fun guessNumber(n:Int):Int {
        if(guess(1) == 0) {
            return 1
        }

        var left: Long = 1
        var right: Long = n.toLong()

        while (left <= right) {
            val center = (left + right) / 2
            when(guess(center.toInt())) {
                -1 -> {
                    right = center - 1
                }
                1 -> {
                    left = center + 1
                }
                0 -> {
                    return center.toInt()
                }
            }
        }
        return left.toInt()
    }

    private fun guess(num:Int):Int {
        val pickedNumber = 6
        return if (num > pickedNumber) {
           -1
        } else if (num < pickedNumber) {
            1
        } else {
            0
        }
    }
}