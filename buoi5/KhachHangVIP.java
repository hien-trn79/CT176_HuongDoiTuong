package buoi5;
// Ho va Ten: Tran Thi Thuy Hien 	MSSV: B2303813
// Nhom 03
// De:... ; So may: ... ; Phong thi: .....
import java.util.Scanner;

public class KhachHangVIP extends KhachHang{
	private Date ngSinh;
	private float tLeGiam;
	
	public KhachHangVIP() {
		super();
		ngSinh = new Date();
		tLeGiam = 0.0f;
	}
	public KhachHangVIP(KhachHangVIP k ) {
		super(k);
		ngSinh = new Date(k.ngSinh);
		tLeGiam = k.tLeGiam;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap ngay thang nam cua KhachHangVIP");
		ngSinh.nhap();
		System.out.println("Nhap ti le giam cua Khach Hang: ");
		tLeGiam = sc.nextFloat();
	}
	public void hienThi() {
		super.hienThi();
		System.out.println("Ngay sinh: "  + ngSinh);
		System.out.println("Ti le giam (%): " + tLeGiam);
	}
	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		return super.toString() +"\nNgay sinh: " + ngSinh + "\nTi le giam: " + tLeGiam;
	}
	public float layTLeGiam() {
		return tLeGiam/100;
	}
}
