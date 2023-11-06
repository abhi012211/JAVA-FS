package first_oops;

public class rec06 {
	public static void main(String[] args) {
		int[] arr= {6,5,7,9};
		int index=0;
		rec(arr,index,7);
	}
	public static void rec(int[] arr,int index,int n) {
		if(index>=arr.length) {
			return;
		}
		if(arr[index]==n) {
			System.out.println(index);
		}
		rec(arr,index+1,n);
	}

}
