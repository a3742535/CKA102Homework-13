// 利用Overloading,設計兩個方法可以找出二維陣列的最大值並回傳

package hw5;

class GetElement {
    public int getMaxElement(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public double getMaxElement(double[][] arr) {
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}

public class Hw5Project03 {
    public static void main() {
        GetElement ge = new GetElement();
        int[][] intArr = {{1, 2, 3}, {4, 5, 6}};
        double[][] doubleArr = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}};
        System.out.println("Max int element: " + ge.getMaxElement(intArr));
        System.out.println("Max double element: " + ge.getMaxElement(doubleArr));
    }
}
