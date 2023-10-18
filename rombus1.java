public class rombus1 {
    public static void main(String[] args) {
        int n = 4;
        int m = 7;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
