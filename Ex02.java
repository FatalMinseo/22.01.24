package 반복문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int answer = 10;
		int user = 0;

		while (user < answer) {
			System.out.print("정수 입력 : ");
			user = sc.nextInt();
		}
		
		
//		while (true) {
//			System.out.println("숫자 입력 >> ");
//			user = sc.nextInt();
//			
//			if(user>10) {
//				break; // 해당하는 반복문을 종료!
//				// 분기문!	
//			}
//		}        
		
		
		
		System.out.println("종료되었습니다.");
		sc.close();
	}
}










