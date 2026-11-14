// 有個一維陣列如下:
// {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

package hw4;

public class Hw4Project01 {
    public static void main(String[] args) {
        int[] numbers = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("總和: " + sum);

        double average = (double)sum / numbers.length;
        System.out.println("平均: " + average);

        System.out.print("大於平均的數字: ");
        for (int num : numbers) {
            if( num > average ) {
                System.out.printf("%d ", num);
            }
        }
    }
}
