package first_oops;

import java.util.Scanner;

public class even_rec01 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
//		if(rec(n)) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}
		
		rec(n);
	}
//	public static boolean rec(int n) {
//		if(n==0) {
//			return false;
//		}
//		if(n%2==0) {
//			return true;
//		}
//		return rec(n-2);
//	}
	public static void rec(int n) {
		if(n<0) {
			return;
		}
		if(n%2==0) {			
			System.out.println(n);
		}
		rec(n-2);
		
	}

}
