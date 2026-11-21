package hw5;

import java.util.Scanner;

public class Hw5Tools {
    private Scanner scanner = new Scanner(System.in);

    public boolean numCheck(int num) {
        return num > 0;
    }

    protected boolean exitProgram() {
        System.out.print("要繼續執行嗎? (y/n): ");
        String input = scanner.next();
        System.out.println("===================================");
        if (!input.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }

    int getOneNum(String prompt) {
        prompt = prompt.length() <= 0 ? "請輸入數字: " : prompt;
        System.out.print(prompt);
        int num = scanner.nextInt();
        return num;
    }
}
