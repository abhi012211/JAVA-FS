package first_oops;

public class rec04 {
	public static void main(String[] args) {
		int n=5;
		rec(1,n);
	}
	public static void rec(int a,int b) {
		int count=0;
		if(a<=b) {
			return;
		}
		if(b%2!=0) {
			count++;
			rec(a+1,b);
		}else {
			rec(a+1,b);
		}
//		if(count==2) {
//			System.out.println("prime");
//		}else {
//			System.out.println("not prime");
//		}
	}

}
