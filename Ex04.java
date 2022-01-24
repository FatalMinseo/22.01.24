package 반복문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		while (a!=-1) {
			System.out.print("숫자 입력 : ");
			a = sc.nextInt();
			if (a%2==0 && a>0) {
				
				System.out.println("짝수 개수 : " + (b=b+1));
				System.out.println("홀수 개수 : " + c);
			} else if (a% 2== 1 && a>0) {
				System.out.println("짝수 개수 : " + b);
				System.out.println("홀수 개수 : " +(c=c+1) );
			}else {
				System.out.println("짝수 개수 : " + b);
				System.out.println("홀수 개수 : " + c );
			}
	}
		System.out.println("종료되었습니다.");
	    sc.close();

}
}