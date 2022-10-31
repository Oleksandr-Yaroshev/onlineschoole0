package seoncd_lesson;

public class third_task {
    public static void main(String[] args) {
        int second = 1;
        int minute = second * 60;
        int hour = minute * 60;
        int day = hour * 24;
        int totalResult = day * 13 + hour * 17 + minute * 35 + second * 17;
        System.out.println(totalResult);
    }
}
