package buoi5;
import java.util.Scanner;

public class ChiTiet {
	private HangHoa h;
	private int sluong;
	private float dgia;
	
	public ChiTiet() {
		h = new HangHoa();
		sluong = 0;
		dgia = 0;
	}
	public ChiTiet(ChiTiet c) {
		h = new HangHoa(c.h);
		sluong = c.sluong;
		dgia = c.dgia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		h.nhap();
		System.out.println("Nhap so luong "+ h.layTen());
		sluong = sc.nextInt();
		System.out.println("Gia cua " + h.layTen());
		dgia = sc.nextFloat();
	}
	public void hienThi() {
		h.hienThi();
		System.out.println("So luong: " + sluong);
		System.out.println("Gia: " + dgia);
	}
	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		return h.toString() + "So luong: " + sluong + "\nGia: " + dgia;
	}
	public float tong() {
		return sluong*dgia;
	}
}
