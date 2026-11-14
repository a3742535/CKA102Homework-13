// 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
// 請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數。
// (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

package hw3;
import java.util.Scanner;
public class Hw3Project03 {
    private final int min = 1;
    private final int max = 49;
    private int excludeKey;

    public static void main(String[] args) {
        while (true) {
            Hw3Project03 game = new Hw3Project03();
            System.out.println("~~大樂透選號~~");
            if(!game.setupGame()) {
                System.out.println("遊戲設定失敗，請重新設定。");
                return;
            }
            String nums = game.printLotteryNumbers();
            game.isAutoGet6Nums(nums);
            if(game.exitProgram()) {
                break;
            }
        }
    }


    public void isAutoGet6Nums(String nums) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("要自動幫您選取六個數字嗎? (y/n): ");
        String input = scanner.next();

        if(input.equalsIgnoreCase("y")) {
            autoGet6Nums(nums);
        }
    }

    private void autoGet6Nums(String nums) {
        String[] numArray = nums.split("\t");
        String[] selectedNums = new String[6];
        int count = 0;
        System.out.println("自動取得的6個數字: ");
        
        while (count<6) {
            int key = (int)(Math.random() * numArray.length);
            String selected = numArray[key];
            boolean alreadySelected = false;

            for (int i = 0; i < count; i++) {
                if (selectedNums[i] != null && selectedNums[i].equals(selected)) {
                    alreadySelected = true;
                    break;
                }
            }
            if (alreadySelected) {
                continue;
            }
            selectedNums[count] = selected;
            System.out.printf("%s ", selected.trim());
            count++;
        }
        System.out.println();
    }

    public boolean setupGame() {
        this.excludeKey = getOneNum("請輸入不喜歡的數字(1~9): ");
        if(this.excludeKey < 1 || this.excludeKey > 9) {
            System.out.println("輸入的數字不在範圍內，請重新輸入。");
            return false;
        }
        return true;
    }

    public String printLotteryNumbers() {
        int count = 0;
        String result = "";
        for (int i = min; i <= max; i++) {
            if( i % 10 == excludeKey || i / 10 == excludeKey ){
                continue;
            }
            count++;
            result += i + "\t" + ( count%9 == 0 ? "\n" : "" );
        }
        System.out.printf("可選的數字:\n%s\n", result);
        System.out.println("總共有: " + count + " 個");
        return result;
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

    public int getOneNum(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int num = scanner.nextInt();
        return num;
    }
}
