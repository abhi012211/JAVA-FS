import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        System.out.println(n%2==0?"even":"odd");
//        if(n%2==0){
//            System.out.println("EVEN");
//        }else{
//            System.out.println("ODD");
//        }
    }
}
