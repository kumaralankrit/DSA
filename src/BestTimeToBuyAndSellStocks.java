public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int a[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(a));
    }

    private static int maxProfit(int[] a) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minPrice)
                minPrice = a[i];
            else if (a[i] - minPrice > maxProfit)
                maxProfit = a[i] - minPrice;
        }
        return maxProfit;
    }
}
