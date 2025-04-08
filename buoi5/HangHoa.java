package buoi5;
import java.util.Scanner;

public class HangHoa {
	private String mso, ten, nsxuat;
	
	public HangHoa() {
		mso = new String();
		ten = new String();
		nsxuat = new String();
	}
	public HangHoa(HangHoa a) {
		mso = new String(a.mso);
		ten = new String(a.ten);
		nsxuat = new String(a.nsxuat);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so cua hang hoa");
		mso = sc.nextLine();
		System.out.println("Ten hang hoa");
		ten = sc.nextLine();
		System.out.println("Nha san xuat cua " + ten);
		nsxuat = sc.nextLine();
	}
	public void hienThi() {
		System.out.println("Ma so: " + mso +"\nTen hang hoa: " + ten + "\nNha san xuat: " + nsxuat);
	}
	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		return "Ma so: " + mso +"\nTen hang hoa: " + ten + "\nNha san xuat: " + nsxuat;
	}
	public String layTen() {
		return ten;
	}
}
