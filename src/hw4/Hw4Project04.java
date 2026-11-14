// 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
// 並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」

package hw4;

import java.util.Scanner;

public class Hw4Project04 {
    private final int cids[] = {25, 32, 8, 19, 27};
    private int cash[] = {2500,800,500,1000,1200};
    public static void main(String[] args) {
        Hw4Project04 borrow = new Hw4Project04();
        int WTB = borrow.getOneNum("想借多少錢? ");
        String lenders = borrow.whoCanLend(WTB);
        System.out.printf("可以借錢的員工編號: %s 共 %d 人\n", lenders, lenders.split(" ").length);
    }

    public String whoCanLend(int amount) {
        String result = "";

        for (int i = 0; i < cids.length; i++) {
            if (cash[i] >= amount) {
                result += cids[i] + " ";
            }
        }
        return result;
    }

    public int getOneNum(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }
}
