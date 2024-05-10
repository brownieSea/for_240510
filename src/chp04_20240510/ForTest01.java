package chp04_20240510;

public class ForTest01 {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i=i+1) {
			System.out.print(i+"/");
		}
		
		System.out.print("\n");
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+"/");
		}
		
		System.out.print("\n");
		
		for (int i=100; i>=0; i--) {
			System.out.print(i+"/");
		}
		
		System.out.print("\n");
		
		// 1부터100 까지의 합
		int sum=0;
		for (int i=1; i<=100; i++) {
			sum=sum+i;
		}
		System.out.println("1-100까지 합계 : " +sum);
		
		// for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드
		int sum2=0;
		for (int i=0; i<=100; i=i+3) {
			sum2 = sum2+i;
		}
		System.out.println("1-100까지 3의 배수 합계 : " + sum2);

		// 위의 문제를 if문과 함께 하면
		int sum3=0;
		for (int i=1; i<=100; i++) {
			if (i% 3 == 0) {
				sum3 = sum3+i;
			}
		}
		System.out.println("1-100까지 3의 배수 합계 : " + sum3);

	}

}
