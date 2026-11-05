package hw2;

public class Hw2Project03 {
    public static void main(String[] args) {
        System.out.println(continuedProductInRange(1, 10));
    }

    static int continuedProductInRange(int start, int end) {
        if( start > 0 && end > 0 && start <= end ){
            int result = 1;
            while (start <= end) {
                result *= start;
                start++;
            }
            return result;
        }
        return -1;
    }
}
