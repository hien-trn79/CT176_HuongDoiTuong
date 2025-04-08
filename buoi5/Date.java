package buoi5;
import java.util.Scanner;

public class Date {
	private int d, m, y;
	
	public Date() {
		d = m = 1;
		y = 2024;
	}
	public Date(Date a) {
		d = a.d;
		m = a.m;
		y = a.y;
	}
	
	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}
	public boolean hopLe() {
		int a[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(y % 400 == 0 || (y %100 != 00 && y%4 == 0)) a[2] = 29;
		boolean h = false;
		if(y > 0 && d <= a[m] && m < 13 && d > 0 && m > 0) h = true;
		return h;
	}
	public int checkNhap() {
		String s;
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			s = sc.nextLine();
			try { 
				n = Integer.parseInt(s);
			} catch(Exception e) {
				System.out.println("Ban nhap sai dinh dang vui long nhap lai");
				n = Integer.MAX_VALUE;
			}
		} while(n == Integer.MAX_VALUE);
		return n;
	}
	public Date ngayHomSau() {
		Date t = new Date(d,m, y);
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
			if(t.d == 1) System.out.println("\nThang " + t.m);
		}
		return t;
	}
	public void nhap() {
		do {
			System.out.println("Nhap ngay");
			d = checkNhap();
			System.out.println("Nhap thang: ");
			m = checkNhap();
			System.out.println("Nhap nam: ");
			y = checkNhap();
		} while(!hopLe());
	}
	public void hienThi() {
		System.out.println(d + "/ " + m + "/ " +y);
	}
	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		return d + "/" + m + "/" + y;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date t = new Date();
		t.nhap();
		System.out.println("Ngay mac dinh ban dau: " + t);
		System.out.println("Thang " + t.m++);
		for(int i=0; i<100; i++) {
			t = t.ngayHomSau();
			System.out.print(t.d + " ");
			if(t.ngayHomSau().d == 1) System.out.println("\nThang " + t.m);
		}
	}
}
