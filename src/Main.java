public class Main {
    public static void main(String[] args) {

        double savings = 15_000f;
        int month = 1;

        while (savings < 12_000_000) {
            month++;
            savings = savings + (savings * 0.07);
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений составляет %f\n", month, savings);
            }
        }
    }
}
