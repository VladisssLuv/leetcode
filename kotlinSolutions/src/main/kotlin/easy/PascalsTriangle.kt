package easy

class PascalsTriangle {
    fun generate(numRows: Int): List<List<Int>> {
        val resultList: MutableList<MutableList<Int>> = mutableListOf(
            mutableListOf(1)
        )
        if (numRows != 1) {
            resultList.add(mutableListOf(1, 1))
            var dp = resultList.last()
            while (resultList.size < numRows) {
                val newDp = mutableListOf<Int>(1)
                for (i in 1 until dp.size) {
                    newDp.add(dp[i] + dp[i-1])
                }
                newDp.add(1)
                dp = newDp
                resultList.add(newDp)
            }
        }
        return resultList
    }
}