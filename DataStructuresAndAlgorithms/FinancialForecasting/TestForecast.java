public class TestForecast {

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 3;

        double futureValue = FinancialForecast.forecast(
                currentValue,
                growthRate,
                years
        );

        System.out.println("Future Value after " + years + " years = " + futureValue);
    }
}
