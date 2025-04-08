package buoi2;
import java.util.Scanner;

public class SDDiem {
	public static void main(String[] args) {
		Diem a = new Diem();
		a.nhap();
		a.hienThi();
		Diem b = new Diem(3,4);
		b.hienThi();
		b.doiDiem(2, 5);
		System.out.println("Diem b sau khi doi");
		b.hienThi();;
	}
}
