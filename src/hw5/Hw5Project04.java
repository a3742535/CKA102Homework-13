package hw5;

class MyRectangle {
    private double width;
    private double height;

    MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    MyRectangle(){}

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

}

public class Hw5Project04 {
    public static void main(String[] args) {
        MyRectangle rect1 = new MyRectangle(5.0, 10.0);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("======================================");
        MyRectangle rect2 = new MyRectangle();
        rect2.setWidth(7.0);
        rect2.setHeight(3.0);
        System.out.println("Area: " + rect2.getArea());
    }
}
