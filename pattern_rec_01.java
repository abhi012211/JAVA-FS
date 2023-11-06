package rec_pattern;

public class pattern_01 {
	public static void main(String[] args) {
		rec(5,5);
	}
	public static void rec(int col,int row) {
		if(row==0) {
			return;
		}
		star(col);
		System.out.println();
		rec(col,row-1);
		
	}
	public static void star(int star) {
		if(star==0) {
			return;
		}
		System.out.print("*");
		star(star-1);
	}

}
