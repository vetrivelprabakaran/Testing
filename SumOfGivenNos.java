package RealTimeProgram;

import java.util.Scanner;

public class SumOfGivenNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  numbers ");
		int n =sc.nextInt();
		int sum =0;
		int ln;
		while(n>0)
		{
			ln=n%10;
			sum=sum+ln;
			n=n/10;
		}
		System.out.println("the sum of given no is"  +sum);

	}

}
