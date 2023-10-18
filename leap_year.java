import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int s= scn.nextInt();
        if(s%4==0){
            if(s%100==0){
                if(s%400==0){
                    System.out.println("LEAP YEAR");
                }else{
                    System.out.println("NOT LEAP YEAR");
                }
            }else{
                System.out.println("NOT LEAP YEAR");
            }
        }else{
            System.out.println("NOT LEAP YEAR");
        }
    }
}
