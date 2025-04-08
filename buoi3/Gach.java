package buoi3;
import java.util.Scanner;

public class Gach {
	private String mso, mau;
	private int sluong, cdai, crong;
	private long gia;
	
	public Gach() {
		mso = new String();
		mau = new String();
		sluong = cdai = crong = 0;
		gia = 0;
	}
	public Gach(Gach a) {
		mso = new String(a.mso);
		mau = new String(a.mau);
		sluong = a.sluong;
		cdai = a.cdai;
		crong = a.crong;
		gia = a.gia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma so cua gach: ");
		mso = sc.nextLine();
		System.out.println("Nhap mau cua gach");
		mau =sc.nextLine();
		System.out.println("So luong vien gach trong 1 hop");
		sluong = sc.nextInt();
		System.out.println("chieu dai vien gach (cm)");
		cdai = sc.nextInt();
		System.out.println("chieu rong vien gach (cm)");
		crong = sc.nextInt();
		System.out.println("Gia cua hop gach");
		gia = sc.nextLong();
	}
	public void hienThi() {
		System.out.println("[" + mso + "-" + mau + "-" + sluong + "-" + cdai + "-" + crong +"-" + gia +"]");
	}
	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}
	public String toString() {
		return "[" + mso + "-" + mau + "-" + sluong + "-" + cdai + "-" + crong +"-"+gia+ "]";
	}
	public float giaBanLe() {
		return (float) 1.2 *gia* sluong;
	}
	public float dienTichMax() {// dien tich toi da cua 1 hop gach
		return (float) (cdai* crong)/10000 * sluong;
	}
	public int soLuongHop(int dai, int rong) {
		int d1 = dai*100/ cdai;
		if(dai*100 % cdai != 0) d1++;
		int r1 = rong*100 / crong;
		if((rong*100)% crong != 0) r1++;
		int sl = (d1*r1)/ sluong;
		if((d1*r1)%sluong == 0) return sl;
		else return sl+1;
	}
	public float chiPhiLot() {
		return gia*sluong;
	}
	public float chiPhi(int d1, int r1) {
		return soLuongHop(d1, r1) * gia;
	}
	public String layMso() {
		return mso;
	}
}
