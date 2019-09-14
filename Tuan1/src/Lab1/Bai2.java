package Lab1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		
		float Dai=0,Rong=0,ChuVi=0,DienTich=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		Dai=sc.nextFloat();
		System.out.println("Nhap chieu rong: ");
		Rong=sc.nextFloat();
		ChuVi=(Dai+Rong)*2;
		DienTich=Dai*Rong;
		System.out.println("Chu Vi la: "+ChuVi);
		System.out.println("Dien tich la: "+DienTich);
		System.out.println("Canh nho nhat la: "+Math.min(Dai, Rong));
		
	}
}
