package �ݺ���;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int answer = 10;
		int user = 0;

		while (user < answer) {
			System.out.print("���� �Է� : ");
			user = sc.nextInt();
		}
		
		
//		while (true) {
//			System.out.println("���� �Է� >> ");
//			user = sc.nextInt();
//			
//			if(user>10) {
//				break; // �ش��ϴ� �ݺ����� ����!
//				// �б⹮!	
//			}
//		}        
		
		
		
		System.out.println("����Ǿ����ϴ�.");
		sc.close();
	}
}










