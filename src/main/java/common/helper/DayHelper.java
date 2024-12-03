package common.helper;

public class DayHelper {
    public static void printDay(Object dayClazz, int task, Long answer) {
        printDay(dayClazz, task, String.valueOf(answer));
    }
    public static void printDay(Object dayClazz, int task, int answer) {
        printDay(dayClazz, task, String.valueOf(answer));
    }
    public static void printDay(Object dayClazz, int task, String answer) {
        System.out.println(dayClazz.getClass().getSimpleName() + ", task " + task + ", answer is: " + answer);
    }
}
