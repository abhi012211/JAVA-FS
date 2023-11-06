package first_oops;

import java.util.Scanner;

public class rec07 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
//		rec(n);
		System.out.println(rec(n));
	}
	public static int rec(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		int sp=rec(n-1);
		return sp*n;
	}

}
