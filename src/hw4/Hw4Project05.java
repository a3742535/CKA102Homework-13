// 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
// 例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
// (需將閏年條件加入)

package hw4;

import java.util.Scanner;

public class Hw4Project05 {
    private Scanner scanner = new Scanner(System.in);
    private final int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        while (true) {
            Hw4Project05 dateChecker = new Hw4Project05();
            int[] date = dateChecker.getYmd();
            if (dateChecker.isValidDate(date[0], date[1], date[2])) {
                int daysOfYear = dateChecker.getDaysInTheYear(date);
                System.out.printf("%s 為該年的第 %s 天", date[0] + "/" + date[1] + "/" + date[2], daysOfYear);
            } else {
                System.out.println("日期無效，請重新輸入！");
            }
            if (dateChecker.exitProgram()) {
                break;
            }
        }
    }
    
    public boolean exitProgram() {
        System.out.print("\n是否要退出程式？(y/n): ");
        String input = scanner.next();
        System.out.println("================================");
        return input.equalsIgnoreCase("y");
    }

    public int getDaysInTheYear(int[] date) {
        int year = date[0];
        int month = date[1];
        int day = date[2];
        int[] monthDaysCopy = monthDays.clone();
        if (isLeapYear(year)) {
            monthDaysCopy[1] = 29;
        }
        int days = 0;
        for (int m = 0; m < month - 1; m++) {
            days += monthDaysCopy[m];
        }
        days += day;
        
        return days;
    }

    public int[] getYmd() {
        int ymd[] = {0, 0, 0};

        int year = getOneNum("請輸入年份(yyyy): ");
        int month = getOneNum("請輸入月份(mm): ");
        int day = getOneNum("請輸入日期(dd): ");

        ymd[0] = year;
        ymd[1] = month;
        ymd[2] = day;

        return ymd;
    }

    private boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) {
            return false;
        }
        int maxDay = monthDays[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        return day >= 1 && day <= maxDay;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int getOneNum(String prompt) {
        System.out.print(prompt);
        int num = scanner.nextInt();
        return num;
    }
}
