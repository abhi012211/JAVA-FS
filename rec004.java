package first_oops;

public class rec004 {
	public static void main(String[] args) {
		int n=4;
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
		return isPrime(n, i+1);
	}
}
