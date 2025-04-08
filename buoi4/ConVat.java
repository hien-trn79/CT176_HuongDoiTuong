package buoi4;
import java.util.Scanner;

public abstract class ConVat {
	private String giong, mau;
	private float cnang;
	
	public ConVat() {
		giong = new String();
		mau = new String();
		cnang = 0.0f;
	}
	public ConVat(ConVat a) {
		giong = new String(a.giong);
		mau = new String(a.mau);
		cnang = a.cnang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Giong cua con vat:");
		giong = sc.nextLine();
		System.out.println("Mau ");
		mau = sc.nextLine();
		System.out.println("Can nang cua con vat");
		cnang = sc.nextFloat();
	}
	public void hienThi() {
		System.out.println(giong + " - " + mau + " - " + cnang);
	}
	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		return giong + " - " + mau + " - " + cnang;
	}
	public abstract void keu();
}
