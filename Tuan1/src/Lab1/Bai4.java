package Lab1;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		
		double a,b,c,delta;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập he so a: ");
		a=sc.nextDouble();
		System.out.println("Nhập he so b: ");
		b=sc.nextDouble();
		System.out.println("Nhập he so c: ");
		c=sc.nextDouble();
		delta = Math.pow(b,2)-4*a*c;
		System.out.println("Delta la: "+delta);
		System.out.println("Can delta la: "+Math.sqrt(delta));
	}
}
