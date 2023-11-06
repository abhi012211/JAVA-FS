import java.util.Scanner;

public class area_para_rec {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int len=scn.nextInt();
        int brid=scn.nextInt();
        area(len,brid);
    }
    public static void area(int len,int brid){
        int result=len*brid;
        int i = len + brid;
        int result2=2*i;
        System.out.println("AREA OF RECTANGLE");
        System.out.println(result);
        System.out.println("PARAMETER OF RECTANGLE");
        System.out.println(result2);
    }
}
