package hw2;

public class Hw2Project01 {
    public static void main(String[] args) {
        int multipleSum = sumMultiplesInRange(0, 1000, 2);
        System.out.println(multipleSum);
    }

    static int sumMultiplesInRange(int start, int end, int multiple) {
        if (start > 0 && end > 0 && start <= end && multiple > 0) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (i % multiple == 0) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
