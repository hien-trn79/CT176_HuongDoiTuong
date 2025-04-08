package buoi4;
import java.util.Scanner;

public class SDConVat {
	public static void main(String[] args) {
		ConVat ds[];
		System.out.println("Nhap so luong con vat:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds = new ConVat[n];
		int c = 0;
		for(int i=0; i<n; i++) {
			System.out.println("Nhap Bo(0), Ga(1), Heo(2):");
			c = sc.nextInt();
			if(c == 0) {
				ds[i] = new Bo();
			} else if(c == 1) ds[i] = new Ga();
			else ds[i] = new Heo();
			ds[i].nhap();
			if(c == 0) {
				System.out.println("Thong tin cua Bo:");
			} else if(c == 1) System.out.println("Thong tin con ga");
			else System.out.println("Thong tin con heo");
			ds[i].hienThi();
			System.out.println("Tieng keu");
			ds[i].keu();
		}
		
	}
}
