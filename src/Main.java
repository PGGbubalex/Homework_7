public class Main {
    public static void main(String[] args) {

        int deposit = 15_000;
        double savingsTotal = 0;
        int month = 0;

        while (savingsTotal<=2_459_000){
            month++;
            savingsTotal = savingsTotal+savingsTotal/100;
            savingsTotal = savingsTotal + deposit;
            System.out.printf("Месяц %d, сумма накоплений равна %f рублей\n", month, savingsTotal);
        }
    }
}