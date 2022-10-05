public class Main {
    public static void main(String[] args) {

        int deposit = 15_000;
        int savingsTotal = 0;
        int month = 0;

        while (savingsTotal<=2_459_000){
            month++;
            savingsTotal = savingsTotal+savingsTotal/100;
            savingsTotal = savingsTotal + deposit;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + savingsTotal + " рублей");
        }
    }
}