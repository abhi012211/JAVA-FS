import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0;
        int count=0;
        while(n>sum){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
