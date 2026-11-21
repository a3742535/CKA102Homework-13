// 請設計一個方法,從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

package hw5;

public class Hw5Project02 extends Hw5Tools {
    private int min;
    private int max;
    private int nums;

    public static void main() {
        while (true) {
            Hw5Project02 hw = new Hw5Project02();
            hw.setup();
            hw.printResult();
            if (hw.exitProgram()) {
                break;
            }
        }
    }

    public void setup(){
        System.out.println("開始設定最小值、最大值與數量...");
        int min = getOneNum("請輸入最小值: ");
        int max = getOneNum("請輸入最大值: ");
        int nums = getOneNum("請輸入數量: ");
        if(!numCheck(min) || !numCheck(max) || !numCheck(nums) || min > max) {
            System.out.println("輸入的最小值、最大值或數量不合法，請重新設定。");
            setup();
            return;
        }
        System.out.println("設定完成。");
        this.min = min;
        this.max = max;
        this.nums = nums;
    }

    public void printResult() {
        System.out.println("本次亂數結果：");
        int sum = 0;
        for (int i = 0; i < nums; i++) {
            int num = getRandomNum();
            System.out.printf("%d\t", num);
            if( i%10 == 9 ) {
                System.out.println();
            }
            sum += num;
        }
        System.out.println("總和: " + sum);
        System.out.println("平均: " + (double) sum / nums);
    }

    private int getRandomNum() {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
    
}
