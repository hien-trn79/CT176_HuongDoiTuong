package buoi2;
import java.util.Scanner;

public class Diem {
	private int x, y;
	
	public Diem() {
		x = y = 0;
	}
	public Diem(Diem a) {
		x = a.x;
		y = a.y;
	}
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int checkNhap() {
		Scanner sc = new Scanner(System.in);
		String s;
		int t;
		do {
			s = sc.nextLine();
			try {
				t = Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println("Ban nhap sa dinh dang. Vui long nhap lai!!");
				t = Integer.MAX_VALUE;
			}
		} while(t == Integer.MAX_VALUE);
		return t;
	}
	public void nhap() {
		System.out.println("Nhap toa do diem x:");
		x = checkNhap();
		System.out.println("Nhap toa do diem y: ");
		y = checkNhap();
	}
	public void hienThi() {
		System.out.println("(" + x +", " + y + ")");
	}
	public void in(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		return "(" + x +", " + y + ")";
	}
	public int layX() {
		return x;
	}
	public int layY() {
		return y;
	}
	public float khoangCach() {
		return (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	public float khoangCach(Diem d) {
		float kc = (float) Math.sqrt(Math.pow(d.x - x, 2) + Math.pow(d.y - y, 2));
		return kc;
	}
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
}
