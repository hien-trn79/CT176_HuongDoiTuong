package buoi3;
import java.util.Scanner;
import buoi2.Date;

public class SinhVien {
	private String mssv, hten;
	private Date nsinh;
	private int sluong;
	private String[] mon, diem;
	
	public SinhVien() {
		mssv = new String();
		hten = new String(); 
		sluong = 0;
		mon = new String[62];
		diem = new String[62];
	}
	public SinhVien(SinhVien a) {
		mssv = new String(a.mssv);
		hten = new String(a.hten);
		sluong = a.sluong;
		for(int i=0;i<sluong; i++) {
			mon[i] = new String(a.mon[i]);
			diem[i] = new String(a.diem[i]);
		}
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<sluong; i++) {
			System.out.println("Nhap mon thu " + (i+1) + ": ");
			mon[i] = sc.nextLine();
			System.out.println("Nhap diem chu cua mon " + mon[i]);
			diem[i] = sc.nextLine();
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mssv:");
		mssv = sc.nextLine();
		System.out.println("Ho va ten: ");
		hten = sc.nextLine();
		System.out.println("Nhap so luong mon hoc can dang ki:");
		sluong = sc.nextInt();
		nhapDiem();
	}
	public void hienThi() {
		System.out.print("[" + mssv + "_" + hten + "-" + sluong + "-");
		for(int i=0; i<sluong; i++) {
			System.out.print(mon[i] + ": " + diem[i] + ";");
		}
		System.out.print("]");
	}
	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		String s = "[" + mssv + "_" + hten + "-" + sluong + "-";
		for(int i=0; i<sluong; i++) {
			s+= mon[i] + ": " + diem[i] + "; ";
		}
		s += "]";
		return s;
	}
	public float diemTb() {
		float sum = 0.0f;
		for(int i=0; i<sluong; i++) {
			if(diem[i].equalsIgnoreCase("a")) sum += 4.0f;
			else if(diem[i].equalsIgnoreCase("b+")) sum += 3.5f;
			else if(diem[i].equalsIgnoreCase("b")) sum += 3.0f;
			else if(diem[i].equalsIgnoreCase("c+")) sum += 2.5f;
			else if(diem[i].equalsIgnoreCase("c")) sum += 2.0f;
			else if(diem[i].equalsIgnoreCase("d+")) sum += 1.5f;
			else if(diem[i].equalsIgnoreCase("d")) sum += 1.0f;
			else sum += 0.0f;
		}
		return sum/sluong;
	}
	public void dkiHocPhan(String tenHp, String diemHP) {
		mon[sluong] = new String(tenHp);
		diem[sluong] = new String(diemHP);
		sluong++;
	}
	public void xoaHP(String tenHp) {
		int i = 0;
		for(i=0; i<sluong; i++) {
			if(mon[i].equalsIgnoreCase(tenHp)) {
				break;
			}
		}
		for(int j=i; j<sluong; j++) {
			mon[j] = mon[j+1];
			diem[j] = diem[j+1];
		}
		sluong--;
	}
	public static void canhCaoHocVu(SinhVien a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i].diemTb() < 1.0f) {
				System.out.println(a[i]);
			}
		}
	}
	public String layTen() {
		hten = hten.trim();
		return hten.substring(hten.lastIndexOf(" ") + 1);
	}
}
