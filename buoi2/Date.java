package buoi2;
import java.util.Scanner;

public class Date {
	private int d, m, y;
	
	public Date() {
		d = m = 1;
		y = 2005;
	}
	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}
	public Date(Date a) {
		d = a.d;
		m = a.m;
		y = a.y;
	}
	public int checkNhap() {
		Scanner sc = new Scanner(System.in);
		String s;
		int n;
		do {
			s = sc.nextLine();
			try {
				n = Integer.parseInt(s);
			} catch(Exception e) {
				System.out.println("Nhap sai dinh dang!. Vui long nhap lai!");
				n = Integer.MAX_VALUE;
			}
		} while(n == Integer.MAX_VALUE);
		return n;
	}
	public boolean hopLe() {
		int a[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(y%400 == 0 || (y%100 != 0 && y%4 ==0 )) a[2] = 29;
		boolean h = false;
		if(d <= a[m] && y > 0 && m <= 12 && d > 0 && m > 0) h = true;
		return h;
	}
	public void nhap() {
		do {
			System.out.println("Nhap ngay");
			d = checkNhap();
			System.out.println("Nhap thang");
			m = checkNhap();
			System.out.println("Nhap nam");
			y = checkNhap();
		} while(!hopLe());
	}
	public void hienThi() {
		System.out.println(d + "/ " + m + "/ " + y);
	}
	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		return d + "/ " + m + "/ " + y;
	}
	public Date ngayHomSau() {
		Date t = new Date(d, m, y);
		t.d++;
		if(!t.hopLe()) {
			t.d = 1;
			t.m++;
			if(t.m > 12) {
				t.m = 1;
				t.y++;
			}
		}
		return t;
	}
	public Date congNgay(int n) {
		Date t = new Date(d, m, y);
		for(int i=0; i<n; i++) {
			t.ngayHomSau();
		}
		return t;
	}
}
