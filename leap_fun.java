import java.util.Scanner;

public class leap_fun {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("ENTER THE YEAR:");
        int n=scn.nextInt();
        leap(n);
    }

    public static void leap(int n) {
        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println("LEAP YEAR");
                }else{
                    System.out.println("NOT LEAP YAER");
                }
            }else{
                System.out.println(" LEAP YEAR");
            }
        }else{
            System.out.println("NOT LEAP YEAR");
        }
    }
}
