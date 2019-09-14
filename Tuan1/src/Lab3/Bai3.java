package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong phan tu trong mang: ");
		int n=sc.nextInt();
		int []a=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Nhap phan tu thu "+i+": ");
		a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		System.out.println("Mang sau khi sap xep la: ");
		for(int i=0;i<n;i++) {
		System.out.print(" " +a[i]+" " );
		
		}
		int min=a[0];
		for(int j=0;j<n;j++) {
			min = Math.min(min, a[j]);
		}
		System.out.println();
		System.out.println("So nho nhat trong mang la: "+ min);
		
		int dem=0,tong=0;
        for(int i=0; i<n;i++)
        {
          if (a[i]%3==0) {
              dem++;
              tong=tong+a[i];
          }
        }
        System.out.println("Trung binh cong cac phan tu chia het cho 3 là: "+tong/dem);
		
	}
}
