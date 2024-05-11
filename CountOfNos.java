package RealTimeProgram;

import java.util.Scanner;

public class CountOfNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  numbers ");
		int n =sc.nextInt();
		int count =0;
		while(n>0)
		{
			n=n/10;
			count++;
			
		}
		System.out.println("the count of given nos is"+count);
		

	}

}
