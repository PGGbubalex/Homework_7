public class Main {
    public static void main(String[] args) {

    int todayIs = 1;
    int firstFriday = 7;
    int daysInMonth = 31;
    int daysInWeek = 7;

    while (todayIs<daysInMonth){
        if (firstFriday==todayIs)
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", todayIs);
        if (todayIs%daysInWeek==0)
            firstFriday = firstFriday + 7;
        todayIs++;
        }
    }
}
