package �ݺ���;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		while (a!=-1) {
			System.out.print("���� �Է� : ");
			a = sc.nextInt();
			if (a%2==0 && a>0) {
				
				System.out.println("¦�� ���� : " + (b=b+1));
				System.out.println("Ȧ�� ���� : " + c);
			} else if (a% 2== 1 && a>0) {
				System.out.println("¦�� ���� : " + b);
				System.out.println("Ȧ�� ���� : " +(c=c+1) );
			}else {
				System.out.println("¦�� ���� : " + b);
				System.out.println("Ȧ�� ���� : " + c );
			}
	}
		System.out.println("����Ǿ����ϴ�.");
	    sc.close();

}
}