

public class stocks {
    public static void main(String[] args) {
        // Example usage
        String stockSymbol = "AAPL";
        double stockPrice = 150.00;
        int quantity = 10;

        double totalValue = calculateTotalValue(stockPrice, quantity);
        System.out.println("Total value of " + quantity + " shares of " + stockSymbol + ": $" + totalValue);
    }

    public static double calculateTotalValue(double price, int quantity) {
        return price * quantity;
    }
    
    public static double calculateProfitLoss(double buyPrice, double currentPrice, int quantity) {
        return (currentPrice - buyPrice) * quantity;
    }
}
