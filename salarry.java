import java.util.Scanner;

public class salarry {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float n=scn.nextFloat();
        float he=n*30/100;
        float ta=n*20/100;
        float da=n*10/100;
        int pf=1500;
        float net=n+he+ta+da-pf;
        System.out.println(net);



    }
}

