import java.util.Scanner;

public class rev_num_user {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int m=num;
        int n= sc.nextInt();
        int sum=0;
        int sum2=0;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        int mup= (int) Math.pow(10,count-1);
        for(int i=0;i<n;i++){
            int rem=m%10;
            int div=m/10;
            sum2=rem*mup+div;
            m=sum2;
        }
        System.out.println(sum2);
    }
}
