package buoi5;
import java.util.Scanner;
// MSSV: B2303813
// Ho va ten: Tran Thi Thuy Hien
// Nhom 03
// De:......; So may: 29: Phong 205/DI
public class HoaDon {
	private String mso, tde, nvien;
	private KhachHang k;
	private ChiTiet ct[];
	private Date ng;
	
	public HoaDon() {
		mso = new String();
		tde = new String();
		nvien = new String();
		k = new KhachHang();
		ct = new ChiTiet[20];
		ng = new Date();
	}
	public HoaDon(HoaDon h1) {
		mso = new String(h1.mso);
		tde = new String(h1.tde);
		nvien = new String(h1.nvien);
		k = new KhachHang(h1.k);
		for(int i=0; i<20; i++) {
			if(h1.ct[i] == null) break;
			else ct[i] = h1.ct[i];
		}
		ng = new Date(h1.ng);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so hoa don: ");
		mso = sc.nextLine();
		System.out.println("Tieu de hoa don: ");
		tde = sc.nextLine();
		System.out.println("Nhan vien thanh toan:");
		nvien = sc.nextLine();
		nvien = k.chuanHoaTen(nvien);
		int c = 0;
		System.out.println("Nhap khachHang(0) hay khach hang VIP(1)");
		c = sc.nextInt();
		if(c == 0) k = new KhachHang();
		else k = new KhachHangVIP();
		k.nhap();
		System.out.println("Nhap so luong chi tiet");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			ct[i] = new ChiTiet();
			System.out.println("Nhap thong tin cua chi tiet thu " + (i+1) + ": ");
			ct[i].nhap();
		}
		System.out.println("Thoi gian in hoa don");
		ng.nhap();
	}
	public float tongHoaDon() {
		float sum = 0.0f;
		for(int i=0; i<20; i++) {
			if(ct[i] == null) break;
			sum += ct[i].tong();
		}
		return (1 - k.layTLeGiam()) * sum;
	}
	public void hienThi() {
		System.out.println("Mso hoa don: " + mso);
		System.out.println("Tieu de thanh toan: " + tde + "\nNhan vien thanh toan: " + nvien +"\nThoi gian thanh toan: " + ng.toString());
		System.out.println("Thong tin khach hang");
		k.hienThi();
		for(int i=0; i<20; i++) {
			if(ct[i] == null) break;
			else ct[i].hienThi();
		}
		System.out.println("Tong tien cua hoa don: " + tongHoaDon());
	}
	public static int checkNhap() {
		Scanner sc = new Scanner(System.in);
		String s;
		int n;
		do {
			s = sc.nextLine();
			try {
				n = Integer.parseInt(s);
			} catch(Exception e) {
				System.out.println("Ban nhap sai dinh dang. Vui long nhap lai!");
				n = Integer.MAX_VALUE;
			}
		} while(n == Integer.MAX_VALUE);
		return n;
	}
	public static float tongAll(HoaDon h[]) {
		float sum = 0.0f;
		for(int i=0; i<h.length; i++) {
			sum += h[i].tongHoaDon(); 
		}
		return sum;
	}
	public static void main(String[] args) {
		HoaDon ds[];
		System.out.println("Nhap so luong hoa don:");
		int n = HoaDon.checkNhap();
		ds = new HoaDon[n];
		for(int i=0; i<n; i++) {
			ds[i] = new HoaDon();
			System.out.println("Nhap thong tin hoa don thu " + (i+1) + ": ");
			ds[i].nhap();
		}
		for(HoaDon e: ds) {
			e.hienThi();
		}
		System.out.println("Tong tien can thanh toan: " + HoaDon.tongAll(ds));
	}
}
