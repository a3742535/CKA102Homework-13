package hw2;

public class NineNineLoop{
	public static void main(String[] args) {
		//for and while
		System.out.println("------loop with for and while------");
		loopWithForAndWhile();
		System.out.println();
		
		//for and do while
		System.out.println("------loop with for and do while------");
		loopWithForAndDoWhile();
		System.out.println();
		
		//while and do while
		System.out.println("------loop with while and do while------");
		loopWithWhileAndDoWhile();
	}
	
	static void loopWithForAndWhile() {
		int i,j;
		for (i = 1; i <= 9; i++) {
			j = 0;
			while(j++ < 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");				
			}
			System.out.println();
		}
    }
	
	static void loopWithForAndDoWhile() {
		int i,j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			do{
				System.out.print(i + "*" + j + "=" + i * j + "\t");				
			}while(j++ < 9);
			System.out.println();
		}
    }
	
	static void loopWithWhileAndDoWhile() {
		int i,j;
		i = 1;
		while(i++ < 9) {
			j = 1;
			do{
				System.out.print(i + "*" + j + "=" + i * j + "\t");				
			}while(j++ < 9);
			System.out.println();
		}
    }
}