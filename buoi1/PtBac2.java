package buoi1;
import java.util.Scanner;
// Viet chuong trinh tinh phuong trinh bac 2 thong qua 2 ham static bac 1 va bac2 
public class PtBac2 {
	public int nhap() {
		Scanner sc = new Scanner(System.in);
		String s;
		int n;
		do {
			System.out.println("Nhap vao 1 so nguyen");
			s = sc.nextLine();
			try {
				n = Integer.parseInt(s);
			} catch(Exception e) {
				System.out.println("Nhap sai dinh dang!");
				n = Integer.MAX_VALUE;
			}
		} while(n == Integer.MAX_VALUE);
		return n;
	}
	public static void ptBac1(double a, double b) {
		// pt co dang ax + b = 0
		if(a == 0) {
			System.out.println("x = " + b);
		} else {
			System.out.println("x = " + (double)(-b/a));
		}
	}
	public static void ptBac2(double a, double b, double c) {
		// pt co dang ax^2 + bx + c = 0
		if(a == 0) {
			ptBac1(b, c);
		} else {
			double delta = b*b - 4*a*c;
			if(delta < 0) System.out.println("Phuong trinh vo nghiem");
			else if(delta == 0) {
				System.out.println("Phuong trinh co nghiem kep x = " + (double)(b/(2*a)));
			} else {
				double x1 = (double)(-b + Math.sqrt(delta))/(2*a);
				double x2 = (double)(-b - Math.sqrt(delta))/(2*a);
				System.out.println("Phuong trinh co 2 nghiem phan biet"); 
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
	public static void main(String[] args) {
		PtBac2 t = new PtBac2();
		int a = t.nhap();
		int b = t.nhap();
		int c = t.nhap();
		t.ptBac2(a, b, c);
	}
}
