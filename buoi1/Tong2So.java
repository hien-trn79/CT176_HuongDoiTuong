package buoi1;
// viet chuong trinh nhap vao 2 so a, b neu sai dinh dang nhap lai. Tinh tong 2 so
import java.util.Scanner;

public class Tong2So {
	public int checkNhap() {
		String s; int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap vao 1 so nguyen : ");
			s = sc.nextLine();
			try {
				n = Integer.parseInt(s);
			} catch(Exception e ) {
				System.out.println("Nhap sai dinh dang. Vui long nhap lai!");
				n = Integer.MAX_VALUE;
			}
		} while(n == Integer.MAX_VALUE);
		return n;
	}
	public int tong() {
		int a = checkNhap();
		int b = checkNhap();
		return a + b;
	}
	public static void main(String[] args) {
		Tong2So t = new Tong2So();
		System.out.println("Tong cua 2 so a + b = "+ t.tong());
	}
}
