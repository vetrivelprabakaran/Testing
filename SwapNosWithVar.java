package RealTimeProgram;

import java.util.Scanner;

public class SwapNosWithVar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("the real numbers are");
		int a =sc.nextInt();
		int b = sc.nextInt();
		System.out.println("the swapping numbers are");
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);

	}

}
