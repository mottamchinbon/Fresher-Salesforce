import java.util.Random;
import java.util.Scanner;

/**
 * Created by Trần Văn Hiện on 11/17/2020.
 * Tìm tổng lớn nhất của 2 phần tử trong mảng số nguyên:
 ➢ Yêu cầu: Cho một mảng các phần tử số nguyên, giá trị mỗi phần tử nằm
    trong khoảng [-(2^30), 2^30 - 1] , tìm tổng lớn nhất được tạo thành từ 2 phần
    tử trong mảng.
 ➢ Ví dụ:
 ● Input: [0, 100, -4, 8, 143, 5, 99, 100]
 ● Output: 243
 */
public class Bai2 {
    public static void main(String[] args) {
        int n = 0;
        boolean check = true;
        while (check)
            try {
                System.out.print("Nhap n=: ");
                Scanner scanner = new Scanner(System.in);
                n = scanner.nextInt();
                if (n <= 0) System.out.println("Nhap n>0");
                else check = false;
            } catch (Exception e) {
                System.out.println("n phai la so tu nhien");
            }
        n = 3 * n;
        int a[] = new int[n];
        int b[] = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            check = true;
            while (check) {
                a[i] = rd.nextInt();
                if ((a[i] > -1073741824) & (a[i] < 1073741823))  //điều kiện nằm trong khoảng [-(2^30), 2^30 - 1]
                    check = false;
            }
        }
        System.out.print("mang ban dau:");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        for(int i=0;i<n-1;i++)
            for (int j=i+1;j<n;j++)
                if (a[i]>a[j])
                {
                    int tg=a[i]; a[i]=a[j]; a[j]=tg;
                }
        System.out.println("Tong lon nhat: "+(a[n-1]+a[n-2]));
    }
}

