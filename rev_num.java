import java.util.Scanner;

public class rev_num {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum*10+rem;
        }
        System.out.println(sum);
    }
}
