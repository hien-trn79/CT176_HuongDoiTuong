package buoi4;
import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem{
	private String mau;
	
	public DiemMau() {
		super();
		mau = new String();
	}
	public DiemMau(DiemMau a) {
		super(a);
		mau = new String(a.mau);
	}
	public DiemMau(int x, int y, String mau) {
		super(x, y);
		this.mau = mau;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in); 
		super.hienThi();
		System.out.println("Nhap mau cua diem:");
		mau = sc.nextLine();
	}
	public void hienThi() {
		super.hienThi();
		System.out.println("mau: " + mau);
	}
	public void ganMau(String s) {
		mau = new String(s);
	}
}
