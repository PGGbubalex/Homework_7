public class Main {
    public static void main(String[] args) {

        int cometInterval = 79;
        int twoHundredYearsAgo = 1822;
        int hundredYearsAfter = 2122;
        int year = 0;

        do {
            year++;
            if (year%cometInterval==0 &&year>twoHundredYearsAgo)
                System.out.println(year);
        }
        while (year <= hundredYearsAfter);
    }
}