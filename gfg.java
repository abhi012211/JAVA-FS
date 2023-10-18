import java.util.ArrayList;

public class gfg {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int arr[] = {1, 4, 5, 7};
        int brr[] = {10, 20, 30, 40};
        int x = 32;
        print(arr, brr, n, m, x);
    }

    public static ArrayList<Integer> print(int arr[], int brr[], int n, int m, int x) {
        int def = Integer.MAX_VALUE;
        int res_l = 0;
        int re_r = 0;
        int l = 0;
        int r = n - 1;
        while (l < m && r >= 0) {
            if (Math.abs(arr[l] + brr[r] - x) < def) {
                res_l = l;
                re_r = r;
                def = Math.abs(arr[l] + brr[r] - x);
            }
            if (arr[l] + brr[r] > x)
                r--;
            else
                l++;
        }
        int a=x-(arr[res_l]+brr[re_r]);
        System.out.print("["+arr[res_l] +","+brr[re_r]+"]"+"=>");
        System.out.println(a);
        return null;
    }

}
