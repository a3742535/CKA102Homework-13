package hw1;

public class Project05 {
    public static void main(String[] args) {
        /*
         * 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,
         * 請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
         */
        double principal = 1500000;
        double rate = 0.02;
        int years = 10;
        
        /*
         * 複利的計算公式為 A = P * (1 + r)^n，
         * 其中 A 為最終金額，P 為本金，r 為利率，n 為年數 
        */
        double amount = principal * Math.pow(1 + rate, years);

        System.out.println("某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算)");
        System.out.println("----------");
        System.out.println("10年後本金加利息共有 " + amount + " 元");
    }
}
