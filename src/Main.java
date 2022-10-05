public class Main {
    public static void main(String[] args) {

        double savings = 15_000f;
        int month = 0;
        int nineYears = 9;
        int monthsInYear = 12;
        int monthsInNineYears = nineYears*monthsInYear;

        while (month<=monthsInNineYears) {

            month++;
            savings = savings + (savings * 0.07);
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений составляет %f\n", month, savings);
            }
        }
    }
}