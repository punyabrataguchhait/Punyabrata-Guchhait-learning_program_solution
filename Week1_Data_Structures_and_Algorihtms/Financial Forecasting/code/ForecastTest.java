public class ForecastTest {
    public static void main(String[] args) {
        double presentValue = 10000.0;
        double growthRate = 0.05;  // 5% annual growth
        int years = 5;

        double futureValue = FinancialForecast.calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future Value (Recursive): %.2f%n", futureValue);

        // Using Memoization
        Double[] memo = new Double[years + 1];
        double futureValueMemo = FinancialForecast.calculateFutureValueMemo(presentValue, growthRate, years, memo);
        System.out.printf("Future Value (Memoized): %.2f%n", futureValueMemo);
    }
}
