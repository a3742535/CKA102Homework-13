// 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
// (進階功能:加入直角三角形的判斷)

package hw3;
import java.util.Scanner;

public class Hw3Project01 {
    public static void main(String[] args) {
        while (true) {
            Hw3Project01 hw3P1 = new Hw3Project01();

            int[] nums = hw3P1.getThreeNumbersInput();
            if (!hw3P1.checkAllNumbers(nums)) {
                System.out.println("輸入的數字需大於0，請重新輸入。");
                continue;
            } else {
                System.out.println("三角形類型: " + hw3P1.checkTriangleType(nums));
            }
            if(hw3P1.exitProgram()) {
                break;
            }
        }
    }

    public boolean isRightTriangle(int a, int b, int c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }

    public String checkTriangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        if (isRightTriangle(a, b, c)) {
            return "直角三角形";
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "不是三角形";
        } else if (a == b && b == c) {
            return "正三角形";
        } else if (a == b || a == c || b == c) {
            return "等腰三角形";
        } else {
            return "一般三角形";
        }
    }

    boolean exitProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("要繼續執行嗎? (y/n): ");
        String input = scanner.next();
        System.out.println("===================================");
        if (!input.equalsIgnoreCase("y")) {
            scanner.close();
            return true;
        }
        return false;
    }

    public int[] getThreeNumbersInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入三個整數: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("三個數字分別為: " + number1 + ", " + number2 + ", " + number3);
        return new int[]{number1, number2, number3};
    }

    public boolean checkNumber(int number) {
        return number > 0;
    }

    public boolean checkAllNumbers(int[] nums) {
        for (int num : nums) {
            if (!checkNumber(num)) {
                return false;
            }
        }
        return true;
    }
}
