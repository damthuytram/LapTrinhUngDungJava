package lab;

import java.util.Scanner;

public class lab3 {
	public static void main(String[] args) {
		
		float canh=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều dài cạnh của khối lập phương: ");
		canh=sc.nextFloat();
		System.out.println("Thể tích của khối lập phương : "+Math.pow(canh,3));	
		System.out.println("hello");
	}
}
