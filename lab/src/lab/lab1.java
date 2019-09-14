package lab;

import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("ho va ten: ");
		String hoTen = sc.nextLine(); 
		System.out.print("Diem TB: ");
		double diemTB = sc.nextDouble();
		System.out.printf("%s output", hoTen, diemTB);
	}
}
