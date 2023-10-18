import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=n;
        int sum=0;
            while(n>0){
                int rem=n%10;
                n=n/10;
                sum=sum*10+rem;
            }
            if(sum==m){
                System.out.println("PALINDOME NUMBER");
            }else{
                System.out.println("NOT PALINDROME NUMBER");
            }
    }
}
