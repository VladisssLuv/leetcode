package easy

class BestTimeToBuyAndSellStock {
    public fun maxProfit(prices: IntArray): Int {
        var minPriceOverPreviousDays: Int = prices[0]
        var maxProfit: Int = 0

        for (price in prices) {
            minPriceOverPreviousDays = if (price < minPriceOverPreviousDays) price else minPriceOverPreviousDays
            val profit = price - minPriceOverPreviousDays
            maxProfit = if (profit > maxProfit) profit else maxProfit
        }

        return maxProfit
    }
}