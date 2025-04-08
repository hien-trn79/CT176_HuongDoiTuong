package buoi2;
import java.util.Scanner;

public class PhanSo {
	private int t, m;
	
	public PhanSo() {
		t = m = 1;
	}
	public PhanSo(int t1, int y1) {
		t = t1;
		m = y1;
	}
	public PhanSo(PhanSo a) { 
		t = a.t;
		m = a.m;
	}
	public int check() {
		String s;
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			s = sc.nextLine();
			try {
				n = Integer.parseInt(s);
			} catch(Exception e) {
				System.out.println("Nhap sai dinh dang vui long nhap lai!");
				n = Integer.MAX_VALUE;
			}
		} while(n== Integer.MAX_VALUE);
		return n;
	}
	public boolean hopLe() {
		if(m == 0 && t != 0) return false;
		else return true;
	}
	public void nhap() {
		do {
			System.out.println("Nhap vao tu so");
			t = check();
			System.out.println("Nhap vao mau so");
			m = check();
		} while(!hopLe());
	}
	public void hienThi() {
		if(t == 0) System.out.println(0);
		else if(m == 1) System.out.println(t);
		else System.out.println(t +"/" + m);
	}
	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		if(t == 0) return "0";
		else if(m == 1) return t + "";
		else return t + "/" + m;
	}
	public void nghichDao() {
		PhanSo a = new PhanSo(m, t);
		if(a.m == 0) System.out.println("Ham vo han");
		else a.hienThi();
	}
	public float giaTriNghichDao() {
		if(t == 0) return -10000000;
		else return (float) m/t;
	}
	public float giaTriPhanSo() {
		if(m == 0) return 0;
		else return (float) t/m;
	}
	public boolean lonHon(PhanSo a) {
		float s = (t * a.m) - (m * a.t);
		if(s < 0) return false;
		else return true;
	}
	public int ucln(int a, int b) {
		while(b != 0) {
			int temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}
	public int layTu() {
		return t;
	}
	public int layMau() {
		return m;
	}
	public PhanSo chuanHoa(PhanSo a) {
		int u = ucln(a.t, a.m);
		a.t /= u;
		a.m /= u;
		return a;
	}
	public PhanSo cong(PhanSo b) {
		PhanSo c = new PhanSo();
		c.t = t*b.m + m*b.t;
		c.m = m * b.m;
		c = chuanHoa(c);
		return c;
	}
	public PhanSo tru(PhanSo b) {
		PhanSo c = new PhanSo();
		c.t = t*b.m - m*b.t;
		c.m = m * b.m;
		c = chuanHoa(c);
		return c;
	}
	public PhanSo nhan(PhanSo b) {
		PhanSo c = new PhanSo();
		c.t = t*b.t;
		c.m = m * b.m;
		c = chuanHoa(c);
		return c;
	}
	public PhanSo chia(PhanSo b) {
		PhanSo c = new PhanSo();
		c.t = t*b.m;
		c.m = m * b.t;
		c = chuanHoa(c);
		return c;
	}
	
}

