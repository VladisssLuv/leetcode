package easy

class HammingDistance {
    fun hammingDistance(x: Int, y: Int): Int {
        var resYXorX = x.xor(y)
        var count = 0
        while (resYXorX != 0) {
            if (resYXorX % 2 != 0) {
                count++
            }
            resYXorX = resYXorX.shr(1)
        }
        return count
    }
}