// 班上有8位同學,他們進行了6次考試結果如資料所示
// 請算出每位同學考最高分的次數

package hw4;
public class Hw4Project06 {
    private int studentsScore[][] = {
        {10,37,100,77,98,90},
        {35,75,70,95,70,80},
        {40,77,79,70,89,100},
        {100,89,90,89,90,75},
        {90,64,75,60,75,50},
        {85,75,70,75,90,20},
        {75,70,79,85,89,99},
        {70,95,90,89,90,75}
    };

    public static void main(String[] args) {
        Hw4Project06 stdScore = new Hw4Project06();
        stdScore.printStudentsScore();
    }

    private void eachStudentHighestTimes(){
        int[] highestTimes = new int[studentsScore.length];

        for (int i = 0; i < studentsScore.length; i++) {
            for (int j = 0; j < studentsScore[i].length; j++) {
                if (studentsScore[i][j] == getExamHighest(j)) {
                    highestTimes[i]++;
                }
            }
        }
        for (int i = 0; i < highestTimes.length; i++) {
            System.out.println("學生" + (i + 1) + "最高分出現次數: " + highestTimes[i]);
        }
    }

    private int getExamHighest(int examTime){
        int highest = 0;
        for (int i = 0; i < studentsScore.length; i++) {
            if (studentsScore[i][examTime] > highest) {
                highest = studentsScore[i][examTime];
            }
        }
        return highest;
    }

    public void printStudentsScore() {
        this.separatorline();
        // Table head
        System.out.print("\t");
        for (int i = 0; i < studentsScore.length; i++) {
            System.out.print("學生" + (i + 1) + "\t");
        }
        System.out.println();

        // Table body
        for (int i = 0; i < studentsScore[0].length; i++) {
            System.out.printf("%d考\t", (i + 1));
            for (int j = 0; j < studentsScore.length; j++) {
                System.out.print(studentsScore[j][i] + "\t");
            }
            System.out.println();
        }
        this.separatorline();
        this.eachStudentHighestTimes();
        this.separatorline();
    }

    private void separatorline(String sbl ,int c){
        System.out.println(sbl.repeat(c));
    }
    private void separatorline(){
        this.separatorline("=", 70);
    }
}
