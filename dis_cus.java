import java.util.Scanner;

public class dis_cus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double total = scn.nextInt();
        double s;
        if (total >= 1000 && total <= 5000) {
            s = 100 - 5;
            double off = (s * total) / 100;
//			total = (total * .05);
            System.out.println("TOTAL=>"+total);
            System.out.println("DISCOUNT=>"+off);
        } else if (total >= 5000 && total <= 10000) {
            s = 100 - 10;
            double off = (s * total) / 100;
            System.out.println("TOTAL=>"+total);
            System.out.println("DISCOUNT=>"+off);
        } else if (total >= 10000 && total <= 20000) {
            s = 100 - 15;
            double off = (s * total) / 100;
            System.out.println("TOTAL=>"+total);
            System.out.println("DISCOUNT=>"+off);
        } else {
            s = 100 - 25;
            double off = (s * total) / 100;
            System.out.println("TOTAL=>"+total);
            System.out.println("DISCOUNT=>"+off);
        }
    }
}
