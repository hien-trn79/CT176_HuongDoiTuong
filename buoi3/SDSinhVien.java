package buoi3;
import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args) {
		/*SinhVien a = new SinhVien();
		a.nhap();
		a.dkiHocPhan("LTHDT", "A");
		a.hienThi()*/
		Scanner sc = new Scanner(System.in);
		SinhVien ds[];
		System.out.println("Nhap so luong sinh vien trong danh sach");
		int n= sc.nextInt();
		ds = new SinhVien[n];
		for(int i=0; i<n; i++) {
			ds[i] = new SinhVien();
			ds[i].nhap();
		}
		System.out.println("Danh sach sinh vien bi canh cao hoc vu");
		SinhVien.canhCaoHocVu(ds);
		SinhVien max = ds[0];
		for(int i=1; i<n; i++) {
			if(ds[i].diemTb() > max.diemTb()) max = ds[i];
		}
		System.out.println("Sinh vien co diem trung binh cao nhat: " + max);
		System.out.println("Danh sach sinh vien sau khi da sap xep");
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(ds[i].layTen().compareToIgnoreCase(ds[j].layTen()) > 0) {
					SinhVien temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
		for(SinhVien e: ds) {
			System.out.println(e);
		}
	}
}
