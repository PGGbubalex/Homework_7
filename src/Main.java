public class Main {
    public static void main(String[] args) {
    int year = 0;
    int population = 12_000_000;
    int birthRatePerThousand = 17;
    int totalBirthRate = (population/1000)*birthRatePerThousand;
    int deathRatePerThousand =8;
    int totalDeathRate = (population/1000)*deathRatePerThousand;
    int birthsThisYear = 0;
    int deathsThisYear = 0;

    while (year<10){
        year++;
        population = population+totalBirthRate-totalDeathRate;
            System.out.println("Год " + year + ", численность населения составляет " + population);

        birthsThisYear = birthsThisYear + totalBirthRate;
            System.out.println("Родилось за " + year + " лет " + birthsThisYear + " человек.");

        deathsThisYear = deathsThisYear + totalDeathRate;
            System.out.println("Умерло за " + year + " лет " + deathsThisYear + " человек.");
    }
    }
}