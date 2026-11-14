// 有個字串陣列如下 (八大行星):
// {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)

package hw4;

public class Hw4Project03 {
    public static void main(String[] args) {
       String planets[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
       int countSum = 0;
       System.out.println("陣列內容"+ java.util.Arrays.toString(planets));
       for (int i = 0; i < planets.length; i++) {
           countSum += countVowelsInStr(planets[i]);
           System.out.println(planets[i] + "有 " + countVowelsInStr(planets[i]) + " 個母音");
       }

       System.out.println("總共找到 " + countSum + " 個母音");
    }

    public static int countVowelsInStr(String s) {
        int count = 0;
        String sAry[] = s.split("");

        for (int i = 0; i < sAry.length; i++) {
            if ("aeiou".contains(sAry[i].toLowerCase())) {
                count++;
            }
        }

        return count;
    }
}
