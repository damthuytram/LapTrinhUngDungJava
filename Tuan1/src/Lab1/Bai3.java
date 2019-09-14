package Lab1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		
		float Canh=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai canh cua khoi lap phuong: ");
		Canh=sc.nextFloat();
		System.out.println("The tich cua khoi lap phuong : "+Math.pow(Canh,3));	
	}
}
