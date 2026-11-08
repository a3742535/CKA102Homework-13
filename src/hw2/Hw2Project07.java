package hw2;

public class Hw2Project07 {
    public static void main(String[] args) {
        printTriangleWithLetter(6);
    }

    static void printTriangleWithLetter(int max){
        char letter = 65;  //test with ASCII value of 'A'

        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letter);
            }
            System.out.println();
            letter++;
        }
    }
}
