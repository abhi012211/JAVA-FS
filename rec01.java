package first_oops;

public class rec01 {
	public static void main(String[] args) {
		int n=10;
		rec(0,n);
//		System.out.println(rec(0,n));
	}
	public static void rec(int a,int b) {
		if(a==b) {
			return;
//			System.out.println("stop");
		}
		System.out.println(a);
		rec(a+1,b);
	}

}
