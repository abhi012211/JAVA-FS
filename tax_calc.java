import java.util.Scanner;

public class tax_calc {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int income=scn.nextInt();
        int s;
        if(income<10000){
            System.out.println("NO TAX");
        } else if (income>=10000 && income<20000) {
            s=100-10;
            int grand_total=(s*income)/100;
            System.out.println(grand_total);
        } else if (income>=20000 && income<30000) {
            s=100-15;
            int grand_total=(s*income)/100;
            System.out.println(grand_total);
        }else{
            s=100-25;
            int grand_total=(s*income)/100;
            System.out.println(grand_total);
        }
    }
}
