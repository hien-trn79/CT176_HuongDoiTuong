package buoi3;
import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gach ds[];
		System.out.println("Nhap vao so luong loai gach");
		int n = sc.nextInt();
		ds = new Gach[n];
		for(int i=0; i<n; i++) {
			ds[i] = new Gach();
			System.out.println("Nhap thong tin cua gach thu " + (i+1) + ": ");
			ds[i].nhap();
		}
		System.out.println("Danh sach so gach vua nhap");
		for(int i=0; i<n; i++) {
			System.out.println((i+1) + ". " + ds[i]);
		}
		Gach min = new Gach(ds[0]);
		for(int i= 0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(ds[j].chiPhiLot() < ds[i].chiPhiLot()) {
					min = ds[j];
				}
			}
		}
		System.out.println("gach co chi phi lot thap nhap \n" + min);
		for(Gach e: ds) {
			System.out.println("Chi phi cua gach " + e.layMso() + " la: " + e.chiPhi(20, 5));
		}
	}
}
