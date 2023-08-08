package easy

class NthTribonacciNumber {
    fun tribonacci(n: Int): Int {
        if (n == 0) {
            return 0
        }

        var dpTriple = Triple(0, 1, 1)

        for (i in 3 ..  n) {
            dpTriple = Triple(dpTriple.second, dpTriple.third, dpTriple.first + dpTriple.second + dpTriple.third)
        }
        return dpTriple.third
    }
}