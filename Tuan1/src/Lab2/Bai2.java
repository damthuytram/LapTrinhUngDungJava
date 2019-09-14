package Lab2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		
		double a,b,c,delta,x,x1,x2,canDelta;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap he so a: ");
		a=sc.nextDouble();
		System.out.println("Nhap he so b: ");
		b=sc.nextDouble();
		System.out.println("Nhap he so c: ");
		c=sc.nextDouble();

		if(a==0) {
			System.out.println("he so a phai >0.");
		}

		else {
			delta = Math.pow(b,2)-4*a*c;
			if(delta<0) {
				System.out.println("Phuong trinh vo nghiem.");
			}
			if(delta==0) {
				x=-b/(2*a);
				System.out.println("nghiem kep: x ="+ x);
			}
			if(delta>0) {
				canDelta=Math.sqrt(delta);
				x1= (-b+canDelta)/(2*a);
				x2 = (-b-canDelta)/(2*a);

				System.out.println("Phuong trinh co 2 nghiem: x1= "+x1+"; x2= "+x2);
			}		
		}
	}
}
