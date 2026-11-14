// 請建立一個字串,經過程式執行後,輸入結果是反過來的
// 例如String s = “Hello World”,執行結果即為dlroW olleH

package hw4;

public class Hw4Project02 {
    public static void main(String[] args) {
        String word = "Hello World";

        System.out.println(reverseString(word));
    }

    public static String reverseString(String s) {
        String[] strAry = s.split("");
        String reversed = "";
        for (int i = strAry.length - 1; i >= 0; i--) {
            reversed += strAry[i];
        }
        return reversed;
    }
}
