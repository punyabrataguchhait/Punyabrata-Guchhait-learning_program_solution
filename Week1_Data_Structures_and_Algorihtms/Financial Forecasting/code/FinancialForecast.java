public class FinancialForecast {

    // Recursive function to calculate Future Value
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + rate) * calculateFutureValue(presentValue, rate, years - 1);
    }

    // Optimized version using Memoization (optional enhancement)
    public static double calculateFutureValueMemo(double presentValue, double rate, int years, Double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != null) return memo[years];
        memo[years] = (1 + rate) * calculateFutureValueMemo(presentValue, rate, years - 1, memo);
        return memo[years];
    }
}
