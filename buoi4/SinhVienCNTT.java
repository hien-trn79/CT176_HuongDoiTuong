package buoi4;
import buoi3.SinhVien;
import java.util.Scanner;

public class SinhVienCNTT extends SinhVien {
	private String tkhoan, mkhau, email;

	public SinhVienCNTT() {
		super();
		tkhoan = new String();
		mkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(SinhVienCNTT a) {
		super(a);
		tkhoan = new String(a.tkhoan);
		mkhau = new String(a.mkhau);
		email = new String(a.email);
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten tai khoan: ");
		tkhoan = sc.nextLine();
		mkhau = sc.nextLine();
		email = sc.nextLine();
	}
	public void hienThi() {
		super.hienThi();
		System.out.println("Ten tai khoan: " + tkhoan);
		String mk = "";
		for(int i=0; i<mkhau.length(); i++) mk += "*";
		System.out.println("Mau khau : " + mk);
		System.out.println("Email: " + email);
	}
	public String toString() {
		String s = super.toString();
		s += tkhoan;
		String mk = "";
		for(int i=0; i<mkhau.length(); i++) mk += "*";
		s+= "\nMat khau: " + mk;
		s+="\nEmail: " + email;
		return s;
	}
}
