// 請設計一個方法,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合

package hw5;

class getAuthCode extends Hw5Tools {
    private int codeLength;

    public getAuthCode() {
        setup(8);
    }

    public getAuthCode(int codeLength) {
        setup(codeLength);
    }

    public void inputSetup(){
        System.out.println("開始設定隨機碼... ");
        int codeLength = getOneNum("請輸入隨機碼長度: ");
        if(!numCheck(codeLength)) {
            System.out.println("輸入的數字需大於0！");
            return;
        }
        setup(codeLength);
    }

    public String getRandomCode() {
        String code = "";
        for (int i = 0; i < codeLength; i++) {
            int type = getRdn(0, 2);
            switch (type) {
                case 0:
                    code += getRdn(0, 9);
                    break;
                case 1:
                    code += (char) getRdn(65, 90);
                    break;
                case 2:
                    code += (char) getRdn(97, 122);
                    break;
            }
        }
        return code;
    }

    private void setup(int codeLength) {
        this.codeLength = numCheck(codeLength) ? codeLength : 8;
    }

    private static int getRdn(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}

public class Hw5Project05 extends Hw5Tools {
    public static void main() {
        while (true) {
            getAuthCode generator = new getAuthCode();
            generator.inputSetup();
            System.out.println("隨機碼: " + generator.getRandomCode());

            if( generator.exitProgram() ){
                break;
            }
        }
    }
}
