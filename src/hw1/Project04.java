package hw1;

public class Project04 {
    public static void main(String[] args) {
        //請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
        final double PI = 3.1415;
        int radius = 5;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長");
        System.out.println("----------");
        System.out.println("圓周率為 " + PI + "，半徑為 " + radius);
        System.out.println("半徑為 " + radius + " 的圓面積為 " + area);
        System.out.println("半徑為 " + radius + " 的圓周長為 " + circumference);
    }
}
