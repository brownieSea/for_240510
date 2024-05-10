package chp04_20240510;

public class ForTest02 {

	public static void main(String[] args) {
		// 중첩 for 문
		
		for (int i=0; i<5; i++) {   // 5회 반복 for문 
			for (int j=0; j<2; j++) {  // 2회 반복 for문
				System.out.println("안녕!");
			}
		}

		// 구구단
		for (int i=2; i<=9; i++) {
			System.out.println("=== " + i + "단 ===");
			for (int j=1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
		
		// 별 찍기
		// *
		// **
		// ***
		// ****
		// *****
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}