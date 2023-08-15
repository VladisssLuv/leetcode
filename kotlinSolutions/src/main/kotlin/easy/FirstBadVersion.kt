package easy

class FirstBadVersion {
    fun firstBadVersion(n: Int) : Int {
        if (isBadVersion(1)) {
            return 1
        }

        var left: Long = 1
        var right: Long = n.toLong()
        while (left < right) {
            val center: Long = (left + right) / 2
            if (isBadVersion(center.toInt())) {
                right = center
            } else {
                left = center + 1
            }
        }

        return left.toInt()
    }

    private fun isBadVersion(version: Int) : Boolean {
        return (version >= 1702766719)
    }
}