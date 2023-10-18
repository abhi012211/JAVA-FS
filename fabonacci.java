import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int sum=0;
        int a=0;
        int b=1;
        int c=0;
       while(n>sum){
//           if (n==1){
//               System.out.println(n);
////           }else{
//
//           }
        c=a+b;
        a=b;
        b=c;
           sum=sum+1;
       }
        System.out.println(c);
    }
}