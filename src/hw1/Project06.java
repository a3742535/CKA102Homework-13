package hw1;

public class Project06 {
    public static void main(String[] args) {
        System.out.println(5+5);    //純數字相加，故等於數字10
        System.out.println(5+'5');  //數字+單引號字元，會變為數字+字元對應的ASCII值，故等於5+53=58
        System.out.println(5+"5");  //數字+字串，會將數字轉為字串後再與字串相加，故等於字串"55"
    }
}
