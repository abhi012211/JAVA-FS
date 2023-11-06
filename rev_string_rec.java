import java.util.Scanner;

public class rev_string_rec {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str= scn.nextLine();
//        rec(str,str.length()-1,"");
        System.out.println(rec(str,str.length()-1,""));
    }
    public static String rec(String str,int index,String str1){
        if(index<=-1){
            return str1;
        }
        char ch=str.charAt(index);
        str1=str1+ch;
        return rec(str,index-1,str1);

    }
}
