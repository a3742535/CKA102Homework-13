package hw1;

public class Project02 {
    public static void main(String[] args) {
        //請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
        int totalEggs = 200;
        int eggsPerDozen = 12;
        int dozens = totalEggs / eggsPerDozen;
        int remainingEggs = totalEggs % eggsPerDozen;

        System.out.println("請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)");
        System.out.println("----------");
        System.out.println("200顆蛋共是 " + dozens + " 打 " + remainingEggs + " 顆");
    }
}
