import java.util.Scanner;

public class mark_sheet {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println(s);
        int n= scn.nextInt();
        float math= scn.nextFloat();
        float hindi= scn.nextFloat();
        float physics= scn.nextFloat();
        float chem= scn.nextFloat();
        float bio= scn.nextFloat();
        float a=math+hindi+physics+chem+bio;
        System.out.println("avg =>"+ a/n);
        System.out.println("marks =>"+a*100/500);
    }
}
