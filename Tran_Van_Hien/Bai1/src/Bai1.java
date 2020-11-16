import java.util.Random;
import java.util.Scanner;
/**
 * Created by Trần Văn Hiện on 11/17/2020.
 * Cấu trúc lại mảng:
 ➢ Yêu cầu: Cho 1 mảng 3n phần tử các số nguyên, giả sử cấu trúc như sau
 [x1, x2, .., xn, y1, y2, ..., yn, z1, z2, ..., zn]. Hãy tổ chức lại các giá trị mảng trên
 về cấu trúc như sau [x1, y1, z1, x2, y2, z2, ..., xn, yn, zn]
 ➢ Ví dụ:
 ● Input: n=3, $arr = [11, 2, 8, 10, 5, 99, 1, 8, 9]
 → Output [11, 10, 1, 2, 5, 8, 8, 99, 9]
 */
public class Bai1 {
    public static void main(String[] args) {
        int n = 0;
        boolean check = true;
        while (check)
            try{
                System.out.print("Nhap n=: ");
                Scanner scanner = new Scanner(System.in);
                n= scanner.nextInt();
                if (n<=0) System.out.println("Nhap n>0"); else check = false;
            }
            catch (Exception e){
                System.out.println("n phai la so tu nhien");
            }
        n=3*n;
        int a[]= new int[n];
        int b[]= new int[n];
        Random rd = new Random();

        int i;
        for(i=0;i<n;i++)  {
            check= true;
            while (check) {
                a[i] = rd.nextInt(100);
                if ((a[i]>-1073741824) & (a[i]<1073741823)) check = false;
            }
        }
        System.out.print("mang ban dau:");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        int t=0;
        for(i=0;i<n;i++)
            if (i % 3 == 0) {
                b[t] = a[i];
                t++;
            }
        for(i=1;i<n;i++)
            if (i % 3 == 1) {
                b[t] = a[i];
                t++;
            }
        for(i=2;i<n;i++)
            if (i % 3 == 2) {
                b[t] = a[i];
                t++;
            }
        System.out.print("mang sau khi cau truc lai:");
        for(i=0;i<n;i++)
            System.out.print(b[i]+" ");
    }
}
