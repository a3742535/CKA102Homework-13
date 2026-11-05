package hw2;

public class Hw2Project05 {
    public static void main(String[] args) {
        int min = 1;
        int max = 49;
        int excludeKey = 4;
        int count = 0;
        String result = "";
        for (int i = min; i <= max; i++) {
            if( i % 10 == excludeKey || i / 10 == excludeKey ){
                continue;
            }
            result += i + " ";
            count++;
        }
        System.out.println("阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？");
        System.out.println("可選的數字: " + result);
        System.out.println("總共有: " + count + " 個");
    }
}
