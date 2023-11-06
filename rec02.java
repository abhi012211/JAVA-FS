package first_oops;

import java.util.Scanner;

public class rec02 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		rec(0,n);
	}
	public static void rec(int a,int b) {
		if(a==b) {
			return;
		}
		if(a%2==0) {
			System.out.println(a);
			rec(a+1,b);
		}else {
			rec(a+1,b);
		}
	}

}
