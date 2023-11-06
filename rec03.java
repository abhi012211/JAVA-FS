package first_oops;

import java.util.Scanner;

public class rec03 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		rec(n);
	}
	public static void rec(int n) {
		if(n==0) {
			return;
		}
		 int rem=n%10;
		 n=n/10;
		rec(n);
		System.out.println(rem);
	}

}
