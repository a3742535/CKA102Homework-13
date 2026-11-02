package hw1;

public class Project03 {
    public static void main(String[] args) {
        //請由程式算出256559秒為多少天、多少小時、多少分與多少秒
        int inputSeconds = 256559;

        //current second
        int currentSecond = inputSeconds % 60;
        int minutes = inputSeconds / 60;

        //current minute
        int currentMinute = minutes % 60;
        int hours = minutes / 60;

        //current hour
        int currentHour = hours % 24;
        int days = hours / 24;

        System.out.println("請由程式算出256559秒為多少天、多少小時、多少分與多少秒");
        System.out.println("----------");
        System.out.println(inputSeconds + " 秒為 " + days + " 天 " + currentHour + " 小時 " + currentMinute + " 分 " + currentSecond + " 秒");

    }
}
