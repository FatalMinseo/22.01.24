package 반복문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		int cnt =0;

		while (a != 0 || b != 0) {

			System.out.print("A 입력 >> ");
			a = sc.nextInt();
			System.out.print("B 입력 >> ");
			b = sc.nextInt();
			System.out.println("결과 >> " + (a - b));
			cnt++;
		}System.out.println("반복 횟수 : " + cnt);
	}
}