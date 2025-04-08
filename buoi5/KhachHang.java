package buoi5;
import java.util.Scanner;
// Ho va Ten: Tran Thi Thuy Hien
// MSSV: B2303813. Nhom : 03
// So may: ... ; Phong: .... 
public class KhachHang {
	private String cccd, hten, dchi;
	
	public KhachHang() {
		cccd = new String();
		hten = new String();
		dchi = new String();
	}
	public KhachHang(KhachHang k) {
		cccd = new String(k.cccd);
		hten = new String(k.hten);
		dchi = new String(k.dchi);
	}
	
	public KhachHang(String cccd, String hten, String dchi) {
		this.cccd = cccd;
		this.hten = hten;
		this.dchi = dchi;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cccd: ");
		cccd = sc.nextLine();
		System.out.println("Nhap ho va ten khach hang:");
		hten = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		dchi = sc.nextLine();
	}
	public void hienThi() {
		hten = chuanHoaTen(hten);
		System.out.println("Cccd: " + cccd +"\nHo va ten: " + hten + "\nDia chi: " + dchi);
	}
	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		return "Cccd: " + cccd +"\nHo va ten: " + hten + "\nDia chi: " + dchi;
	}
	public float layTLeGiam() {
		return 0;
	}
	public char toUp(char c) {
		if(c > 'a' && c < 'z') c-=32;
		return c;
	}
	public String chuanHoaTen(String hten1) {
		hten1 = hten1.trim().toLowerCase();
		String s[] = hten1.split(" ");
		String ten = "";
		char temp[];
		for(String e: s) {
			if(!e.isEmpty()) {
				temp = e.toCharArray();
				temp[0] = toUp(temp[0]);
				e = new String(temp);
				ten = ten + e + " ";
			}
		}
		return ten;
	}
	public static void main(String[] args) {
		KhachHang k = new KhachHang("087305010628", "tran  thI   thUy  Hien    ", "dong thap");
		k.hienThi();
	}
}
