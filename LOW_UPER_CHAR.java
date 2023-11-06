import java.util.Scanner;

public class LOW_UPER_CHAR {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        string(str);
    }
    public static void string(String str){
//        String str1=str.toLowerCase();
//        System.out.println(str1);
//        System.out.println(str.toUpperCase());
//        System.out.println(str.);
//        char ch=str.charAt(0);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(0);
            if(Character.isLowerCase(ch)){
                int n=(int) ch;
                System.out.println(n);

//                ch.toUpperCase();
//                System.out.println(str.toUpperCase());
            }else{
                str.toLowerCase();
//                System.out.println(str.toLowerCase());
            }
        }
        System.out.println(str);

    }
}
