import java.util.Scanner;

public class vobels {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char ch=scn.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'&&ch=='U'){
            System.out.println("this is vowel");
        }else{
            System.out.println("this is consonent");
        }

    }
}
