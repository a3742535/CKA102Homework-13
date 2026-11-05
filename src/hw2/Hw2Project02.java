package hw2;

public class Hw2Project02 {
    public static void main(String[] args) {
        System.out.println(continuedProductInRange(1, 10));
    }

    static int continuedProductInRange(int start, int end) {
        if( start > 0 && end > 0 && start <= end ){
            int result = 1;
            for (int i = start; i <= end; i++) {
                result *= i;
            }
            return result;
        }
        return -1;
    }
}
