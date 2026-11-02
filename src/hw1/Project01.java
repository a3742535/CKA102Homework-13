package hw1;

public class Project01 {
    public static void main(String[] args) {
        

        //請設計一隻Java程式,計算12,6這兩個數值的和與積
        int q1val1 = 6;
        int q1val2 = 12;

        System.out.println("請設計一隻Java程式,計算12,6這兩個數值的和與積");
        System.out.println("----------");
        System.out.println(q1val1+" + "+q1val2+" = "+sum(q1val1, q1val2));
        System.out.println(q1val1+" * "+q1val2+" = "+multiply(q1val1, q1val2));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
