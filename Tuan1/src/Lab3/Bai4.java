package Lab3;

import java.util.Scanner;

public class Bai4 {

public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien: ");
		int n=sc.nextInt();
		String[]HoTen=new String[n];
		float []Diem=new float[n];
		
		for(int i=0;i<n;i++) {
			sc = new Scanner(System.in);
			System.out.println("Nhap ten sv "+(i+1)+": ");
			HoTen[i]=sc.nextLine();
			
			for(;;){
				System.out.println("Nhap diem sv"+(i+1)+": ");
                Diem[i] = sc.nextFloat();
                if(Diem[i]>=0&&Diem[i]<=10) {
                   break;
                }
                else
                    System.out.println("Nhap lai diem(0->10)");

            }
		}
		for(int i=0;i<n;i++) {
			System.out.println("*******************");
			System.out.println("Ho ten: "+HoTen[i]);
			System.out.println("Diem: "+Diem[i]);
			if(Diem[i]<5) {
				System.out.println("Hoc luc: Yeu");
			}
			else if (Diem[i] < 6.5) {
                System.out.println("Hoc luc: Trung binh");
			}
            else if (Diem[i] < 7.5) {
                System.out.println("Hoc luc: Kha");
            }
            else if (Diem[i] < 9) {
                System.out.println("Hoc luc: Gioi");
            }
            else {
                System.out.println("Hoc luc: Xuat sac");
            }
			
		}
		
		for(int i =0; i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(Diem[i]>Diem[j]){
                    float DiemTam=Diem[i];
                       Diem[i]=Diem[j];
                       Diem[j]=DiemTam;
                       
                    String TenTam=HoTen[i];
                       HoTen[i]=HoTen[j];
                       HoTen[j]=TenTam;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println();
            System.out.println("Ho ten: " + HoTen[i]+". Diem: " + Diem[i]);
        }
		
	}
}
