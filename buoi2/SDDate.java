package buoi2;
import java.util.Scanner;

public class SDDate {
	public static void main(String[] args) {
		Date a = new Date();
		a.nhap();
		a.hienThi();
		Date b = a.ngayHomSau();
		b.hienThi();
	}
}
