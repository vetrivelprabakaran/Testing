package RealTimeProgram;

import java.util.Scanner;

public class WithOutVar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("the real numbers are");
		int a =sc.nextInt();
		int b = sc.nextInt();
		System.out.println("the swapping numbers are");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		

	}

}
