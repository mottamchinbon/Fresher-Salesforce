import java.util.Random;
import java.util.Scanner;

/**
 * Created by Trần Văn Hiện on 11/17/2020.
 * Tìm các cặp giá trị có khoảng cách nhỏ nhất:
 ➢ Yêu cầu: Cho 1 mảng các số nguyên, tìm các cặp giá trị có khoảng cách
     bằng với khoảng cách nhỏ nhất giữ 2 phần tử trong mảng (khoảng cách là
     giá trị dương). Mỗi phần tử trong mảng ban đầu có thể nằm trong nhiều cặp
    giá trị kết quả. Giới hạn mảng max 10.000 phần tử.
 ➢ Ví dụ:
 ● Input: [1, 5, 4, 7, 9, 0, -10, 13, 93, 14, 15]
     Sau khi tính toàn thì thấy khoảng cách nhỏ nhất giữa 2 phần tử trong
     mảng là 1. Do đó output sẽ có các cặp giá trị sau: [[0, 1], [4, 5], [13, 14],
    [14, 15]]
 */
public class Bai3 {
    public static void main(String[] args) {
        int n=0;
        boolean check = true;
        while (check)
            try {
                System.out.print("Nhap n=: ");
                Scanner scanner = new Scanner(System.in);
                n = scanner.nextInt();
                if ((n <= 1) || (n>1000)) System.out.println("Nhap n>2 va n<=10000");
                else check = false;
            } catch (Exception e) {
                System.out.println("n phai la so tu nhien");
            }
        Random rd = new Random();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            check = true;
            while (check) {
                a[i] = rd.nextInt();
                if ((a[i] > -1073741824) & (a[i] < 1073741823))
                    check = false;
            }
        }
        System.out.print("mang ban dau:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        for(int i=0;i<n-1;i++)
            for (int j=i+1;j<n;j++)
                if (a[i]>a[j])
                {
                    int tg=a[i]; a[i]=a[j]; a[j]=tg;
                }
        System.out.println();
        int min=a[n-1]-a[0];
        for (int i=0;i<n-1;i++)
            if ((a[i+1]-a[i]) < min) min = a[i+1]-a[i];
        System.out.print("Cac cap gia tri co khoang cach nho nhat la: ");
        for (int i=0;i<n-1;i++) if ((a[i+1]-a[i]) == min) System.out.print("["+a[i]+","+a[i+1]+"] ");

    }

}
