package medium

class PeakIndexInAMountainArray {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var indexOfMaxElement = 0

        if (arr.size > 3) {
            var left = 1
            var right = arr.size - 2
            while (left <= right) {
                if (arr[left] > arr[indexOfMaxElement]) {
                    indexOfMaxElement = left
                }
                if (arr[right] > arr[indexOfMaxElement]) {
                    indexOfMaxElement = right
                }
                left++
                right--
            }
        } else {
            indexOfMaxElement = 1
        }

        return indexOfMaxElement
    }
}