package �ݺ���;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		int cnt =0;

		while (a != 0 || b != 0) {

			System.out.print("A �Է� >> ");
			a = sc.nextInt();
			System.out.print("B �Է� >> ");
			b = sc.nextInt();
			System.out.println("��� >> " + (a - b));
			cnt++;
		}System.out.println("�ݺ� Ƚ�� : " + cnt);
	}
}