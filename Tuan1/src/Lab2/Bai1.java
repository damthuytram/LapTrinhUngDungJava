package Lab2;

import java.util.Scanner;

public class Bai1 {
	
	public static void main(String[] args) {
		
		double a,b,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap he so a: ");
		a=sc.nextDouble();
		System.out.println("Nhap he so b: ");
		b=sc.nextDouble();
		
		if(a==0) {
			if(b==0) {
				System.out.println("Phuong trinh vo so nghiem.");
			}
			else {
				System.out.println("Phuong trinh vo nghiem.");
			}
		}
		else {
			x=(-b)/a;
			System.out.println("Phuong trinh co nghiem la: " +x );
		}

	}

}
