package chp04_20240510;

public class WhileTest01 {

	public static void main(String[] args) {
		// while / do while
		int i=1;
		while (i<=100) {
			System.out.println(i);
			i++;
		}
		
		// 무한루프일때, if문으로 break 조건 넣어주기
		int j=1;
		while(true) {
			j++;
			System.out.println(j);
			if (j ==1000) {
				break;
			}
		}
		
		// do, while
		// 1번은 무조건 실행, 실행후 조건에 따라 반복 여부 결정.
		do {
			System.out.println("안녕");
		} while(false);
		
		
		// continue
		// continue를 만나면 반복문 시작점으로 돌아간다.
		for (int k=1; k<=10; k++) {
			if (k%3==0) {
				continue;
			}
			System.out.println(k);
		}

	}

}
