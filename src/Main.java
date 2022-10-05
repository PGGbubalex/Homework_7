public class Main {
    public static void main(String[] args) {

        int salary = 15_000;
        double savings = 15_000f;
        int month = 1;

        while (savings < 12_000_000) {
            month++;
            savings = savings + (savings * 0.07);
            savings = savings + salary;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяц Василий накопил " + savings + " рублей.");
            }
        }
    }
}