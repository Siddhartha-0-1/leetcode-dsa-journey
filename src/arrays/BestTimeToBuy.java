package arrays;

public class BestTimeToBuy {
    int min(int a, int b) {
        return (a < b) ? a : b;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public int besttimetobuy(int price[]) {
        int bestbuy = price[0], maxprofit = 0, profit;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > bestbuy) {
                profit = price[i] - bestbuy;
                maxprofit = max(maxprofit, profit);
            }
            bestbuy = min(price[i], bestbuy);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        BestTimeToBuy obj = new BestTimeToBuy();
        int price[] = { 7, 1, 5, 3, 6, 4 };
        int res = obj.besttimetobuy(price);
        System.out.println(res);

    }
}
