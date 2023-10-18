public class rombus3 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            if(i==0 || i==3) {
                for(int k=0;k<n;k++) {
                    System.out.print("*");
                }
            }else {
                for(int l=0;l<n;l++) {
                    if(l==0 || l==3) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
