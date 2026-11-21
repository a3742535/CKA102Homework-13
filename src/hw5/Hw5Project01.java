// 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形

package hw5;

public class Hw5Project01 extends Hw5Tools {
    private int width;
    private int height;

    public static void main(String[] args) {
        while (true) {
            Hw5Project01 hw = new Hw5Project01();
            hw.setup();
            hw.drawRectangle();
            if (hw.exitProgram()) {
                break;
            }
        }
    }

    public void drawRectangle() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void setup() {
        System.out.println("開始設定要繪製長方形的寬與高...");
        int width = getOneNum("請輸入寬: ");
        int height = getOneNum("請輸入高: ");
        if(!numCheck(width) || !numCheck(height)) {
            System.out.println("輸入的寬或高不合法，請重新設定。");
            setup();
        }
        System.out.println("設定完成。");
        this.width = width;
        this.height = height;
    }
}
