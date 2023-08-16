package easy

class CanPlaceFlowers {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if (n == 0) {
            return true
        }

        var countOfFreePlots = 0

        for (i in flowerbed.indices) {
            if ((flowerbed.getOrNull(i - 1) ?: 0) == 0
                && flowerbed[i] == 0
                && (flowerbed.getOrNull(i + 1) ?: 0) == 0
            ) {
                countOfFreePlots++
                flowerbed[i] = 1
            }
        }

        return n <= countOfFreePlots
    }
}