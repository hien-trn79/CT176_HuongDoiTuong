package buoi3;
import buoi2.Diem;
import java.util.Scanner;

public class DoanThang {
	private Diem d1, d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(DoanThang d) {
		d1 = new Diem(d.d1);
		d2 = new Diem(d.d2);
	}
	public DoanThang(Diem a, Diem b) {
		d1 = new Diem(a);
		d2 = new Diem(b);
	}
	public void nhap() {
		System.out.println("Nhap diem thu 1");
		d1.nhap();
		System.out.println("Nhap diem thu 2");
		d2.nhap();
	}
	public void hienThi() {
		System.out.println("[" + d1 +", " + d2 +"]");
	}
	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		return "[" + d1 +", " + d2 +"]";
	}
	public void doiDiem(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float doDaiDoanThang() {
		return d1.khoangCach(d2);
	}
}
