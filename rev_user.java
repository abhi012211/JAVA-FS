package first_oops;

import java.util.Scanner;

public class rev_user {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int n=scn.nextInt();
		int m=num;
		int sum=0;
		int sum1=0;
		int count=0;
		while(num>sum) {
			num=num/10;
			count++;
		}
		System.out.println(count);
		int mup=(int) Math.pow(10, count);
		for(int i=0;i<n;i++) {
			int rem=m%10;
			int div=m/10;
			sum1=rem*mup+div;
			m=sum1;
		}
		System.out.println(sum1);
	}

}

