package Lab3;

import java.util.Scanner;

public class Bai1 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		int n;
		boolean ok=true;
		sc = new Scanner(System.in);
		System.out.println("Nhap vao 1 so: ");
		n=sc.nextInt();
		for(int i=2; i < n-1; i++){ 
			if(n % i == 0){
			ok = false; 
			break;
			} 
			}


	if(ok==true) {
		System.out.println("So vua nhap la so nguyen to");
	}
	else
	{
		System.out.println("So vua nhap khong phai so nguyen to");
	}
}
}
