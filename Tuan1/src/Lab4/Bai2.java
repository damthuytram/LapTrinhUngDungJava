package Lab4;

public class Bai2 {
	public static void main(String[] args) {
		

		SanPham sp1=new SanPham();
		SanPham sp2=new SanPham();
		System.out.println("Nhap Thong Tin SP1: ");
		sp1.nhap();
		System.out.println();
		System.out.println("Nhap Thong Tin SP2: ");
		sp2.nhap();
		System.out.println();
		
		System.out.println("Thong tin SP1: ");
		sp1.xuat();
		System.out.println("--------------");
		System.out.println("Thong tin SP2: ");
		sp2.xuat();
		System.out.println();
	}

}
