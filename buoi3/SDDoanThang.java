package buoi3;
import java.util.Scanner;
import buoi2.Diem;

public class SDDoanThang {
	public static void main(String[] args) {
		Diem a = new Diem(2, 5);
		Diem b = new Diem(20, 35);
		DoanThang ab = new DoanThang(a, b);
		ab.doiDiem(5,3);
		ab.hienThi();
		DoanThang cd = new DoanThang();
		cd.nhap();
		System.out.println("Do dai cua doan thang cd = " + cd.doDaiDoanThang());
	}
}
