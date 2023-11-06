package first_oops;

import java.util.Scanner;

public class even_rec {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
//		if()
//		int count=0;
		rec(n,1,0);
//		if(isPrime(n,2)) {
//			System.out.println("prime");
//		}else {
//			System.out.println("not prime");
//		}
	}
	public static boolean isPrime(int n,int i) {
		if(i>n/2) {
			return true;
		}
		if(n%i==0) {
			return false;
		}
		return isPrime(n,i+1);
	}
	public static void  rec(int n,int i,int count) {
		if(i<=n) {
			return;
		}
		if(count==2) {
			System.out.println("prime");
		}
		if(i%2!=0) {
			rec(n,i+1,count+1);
		}else {
			rec(n,i+1,count);
		}
		
	}

}
