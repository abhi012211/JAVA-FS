import java.util.Scanner;

public class greter_3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int o=scn.nextInt();
        int p=scn.nextInt();
        System.out.println(n>o?(o>n?o:n):(o>p?o:p));
    }
}
