import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float p=scn.nextFloat();
        float r= scn.nextFloat();
        float t= scn.nextFloat();
        sp(p,r,t);

    }
    public static void sp(float p,float r,float t)
    {
        float s=(p*r*t)/100;
        System.out.println(s);
    }
}
