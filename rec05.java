package first_oops;

import java.util.Scanner;

public class rec05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
		String str = scn.nextLine();
		int index=str.length()-1;
//		String str1="";
//		rec(n);
//		rec1(str,"",index);
		System.out.println(rec1(str,"",index));
//		rec2(n);
//		System.out.println(rec2(0,n));
	}

	public static void rec(int n) {
		if (n == 0) {
			return;
		}
		int rem = n % 10;
		n = n / 10;
		System.out.print(rem);
		rec(n);
//		System.out.print(rem);
	}

	public static String rec1(String str,String str1,int index) {
		if(index<=-1) {
			return str1;
		}
		char ch=str.charAt(index);
		str1+=ch;
		return rec1(str,str1,index-1);
		
	}

	public static int rec2(int rev,int n) {
//		int rev = 0;
		if (n <= 0) {
			return rev;
		}
		int rem = n % 10;
		rev = rev * 10 + rem;
		n=n/10;
		return rec2(rev,n);
	}

}
