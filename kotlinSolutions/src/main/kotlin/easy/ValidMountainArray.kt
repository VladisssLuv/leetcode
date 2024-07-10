package easy

class ValidMountainArray {
    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3)
            return false

        var flag = true
        for (i in 1.. arr.size - 1) {
            if(flag) {
                if (arr[i-1] < arr[i]) {
                    flag = false
                    continue
                } else if (arr[i-1] == arr[i]) {
                    return false
                }
            } else {
                if (arr[i-1] <= arr[i]) {
                    return false
                }
            }
        }
        return true
    }
}