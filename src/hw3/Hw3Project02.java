// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
// (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

package hw3;
import java.util.Scanner;

public class Hw3Project02 {
    private int maxNum = -1;
    private int minNum = -1;
    private int targetNum = -1;
    private boolean gameOver = false;
    private int[] guessNum = new int[]{-1, -1};
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            Hw3Project02 game = new Hw3Project02();
            if(!game.setupGame()) {
                System.out.println("遊戲設定失敗，請重新設定範圍。");
                continue;
            }
            System.out.println("遊戲設定成功，範圍為 " + game.getMinNum() + " 到 " + game.getMaxNum() + "，請開始猜數字。");
            System.out.println(game.targetNum());
            game.playGame();
            if(game.exitProgram()) {
                break;
            }
        }
    }

    public int targetNum() {
        return this.targetNum;
    }

    public int getMinNum() {
        return this.minNum;
    }
    
    public int getMaxNum() {
        return this.maxNum;
    }

    public boolean setupGame() {
        System.out.println("開始遊戲設定...");
        this.minNum = getOneNum("請輸入最小數字: ");
        this.maxNum = getOneNum("請輸入最大數字: ");

        if (!this.checkRange()) {
            return false;
        }
        this.targetNum = (int)(Math.random() * (maxNum - minNum + 1) + minNum);

        return true;
    }

    public boolean checkRange(){
        return minNum >= 0 && maxNum > minNum;
    }

    public void playGame() {
        while (!gameOver) {
            guessNum[1] = guessNum[0] > 0 ? guessNum[0] : -1;
            this.guessNum[0] = getOneNum("請猜一個數字: ");
            if (guessNum[0] < minNum || guessNum[0] > maxNum) {
                System.out.println("數字不在範圍內，請重新輸入。");
                continue;
            }
            if (guessNum[0] == targetNum) {
                System.out.println("恭喜你猜對了！");
                gameOver = true;
            } else if (guessNum[0] < targetNum) {
                System.out.printf("太小了！ (%d~%d)\n", guessNum[0], (guessNum[1]>0 ? guessNum[1] : maxNum));
            } else {
                System.out.printf("太大了！ (%d~%d)\n", (guessNum[1]>0 ? guessNum[1] : minNum), guessNum[0]);
            }
        }
    }

    boolean exitProgram() {
        System.out.print("要繼續執行嗎? (y/n): ");
        String input = scanner.next();
        System.out.println("===================================");
        if (!input.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }

    public int getOneNum(String prompt) {
        System.out.print(prompt);
        int num = scanner.nextInt();
        return num;
    }
}
