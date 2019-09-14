package Lab1;

import java.util.Scanner;

public class Bai1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Ho va Ten: ");
		String HoTen = sc.nextLine(); 
		System.out.print("Diem TB: ");
		double DiemTB = sc.nextDouble();
		System.out.printf("%s %f Diem", HoTen, DiemTB);
	}
}
