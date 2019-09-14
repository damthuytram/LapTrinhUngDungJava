package Lab2;

import java.util.Scanner;

public class Bai3 {

public static void main(String[] args) {
		
		double Tien,SoDien;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so dien: ");
		SoDien= sc.nextDouble();
		if(SoDien<50) {
			Tien=SoDien*1000;

		}
		else {
			Tien = 50*1000 + (SoDien - 50)*1200;
		}
		System.out.println("Tien dien la: "+Tien);
	}
}
