package hw2;

public class Hw2Project06 {
    public static void main(String[] args) {
        printTriangleWithNumber(10);
    }

    static void printTriangleWithNumber(int max){
        int maxLess = max;
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= maxLess; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            maxLess--;
        }
    }
}
