package day3.exercise;

public class ForLab8 {

	public static void main(String[] args) {
		
//		for(int i = 1 ; i <= 5 ; i++) {
//			for(int j = 1; j <= i ; j++) {
//				System.out.print(' ');
//			}
//			System.out.println("**********");
//		}

		// 이렇게 구현하라고 낸 문제
		final char STAR = '*';
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i-1 ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j<=10; j++) {
				System.out.print(STAR);
			}
			System.out.println();
		}
		
	}

}

//[ 실습4 ] 모양 출력(중첩 for)
//1. ForLab8 라는 클래스를 생성한다.
//2. 다음과 같은 결과가 되도록 구현한다.
//
//    ********** 
//	   ********** 
//  	********** 
// 	   	 ********** 
//	   	  **********