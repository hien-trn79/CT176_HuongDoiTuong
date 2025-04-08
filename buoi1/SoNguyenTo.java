package buoi1;
// Viet chuong trinh nhap vao 1 so nguyen. Kiem tra so nguyen to. in duoi dang nhi phan
import java.util.Scanner;

public class SoNguyenTo {
	public int nhap() {
		String s;
		int n;
		Scanner sc = new Scanner(System.in);
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
	public boolean ngto(int n) {
		if(n < 2) return false;
		else {
			for(int i=2; i < n; i++) {
				if(n%i == 0) return false;
			}
			return true;
		}
	}
	public void chuyenNhiPhan(int n) {
		int c[] = new int[10];
		int temp = n;
		int i = 0;
		while(n > 0) {
			c[i] = n%2;
			i++;
			n/=2;
		}
		int cnt = 0;
		System.out.println("So nhi phan cua " + temp + " la ");
		for(int j = i-1; j>=0; j--) {
			System.out.print(c[j]);
			cnt++;
			if(cnt %4 == 0) System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SoNguyenTo t = new SoNguyenTo();
		int n = sc.nextInt();
		if(t.ngto(n)) System.out.println("Day la so nguyen to");
		else System.out.println("Day khong phai la so nguyen to");
		t.chuyenNhiPhan(n);
	}
}
