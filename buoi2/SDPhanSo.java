package buoi2;
import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] args) {
		/* PhanSo a = new PhanSo(1, 2);
		PhanSo b = new PhanSo();
		b.nhap();
		System.out.println("Phan so thu nhat");
		a.hienThi();
		System.out.println("gia tri nghich dao = " + a.giaTriNghichDao());
		System.out.println("Phan so thu 2");
		b.hienThi();
		System.out.println("Gia tri nghic dao = " + b.giaTriNghichDao());
		PhanSo c = a.cong(b);
		System.out.println("Tong 2 phan so = " + c);
		c = a.tru(b);
		System.out.println("tru 2 phan so = " + c);
		c = a.nhan(b);
		System.out.println("Nhan 2 phan so = " + c );
		c = a.chia(b);
		System.out.println("chia 2 phan so = " + c);
		System.out.println("Phan so nghich dao cua b");
		b.nghichDao();
	*/
		PhanSo ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan so");
		int n = sc.nextInt();
		ds = new PhanSo[n];
		for(int i=0; i<n; i++) {
			ds[i] = new PhanSo();
			System.out.println("Nhap phan so thu " + (i+1) + ": ");
			ds[i].nhap();
		}
		float sum = 0.0f;
		for(int i=0; i<n; i++) {
			sum += (float) ds[i].layTu()/ds[i].layMau();
		}
		System.out.println("Tong cac phan so = " + sum);
		// sap xep theo thu tu tang dan
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(ds[i].giaTriPhanSo() > ds[j].giaTriPhanSo() ) {
					PhanSo temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
		for(PhanSo e: ds) System.out.print(e + " ");
	}
}
