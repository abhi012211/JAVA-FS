package first_oops;

import java.util.Scanner;

public class even_rec {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		if(isPrime(n,2)) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
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
}
