public class FinancialForecast {

    public static double forecast(double currentValue, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Call
        return forecast(currentValue * (1 + growthRate), growthRate, years - 1);
    }
}

