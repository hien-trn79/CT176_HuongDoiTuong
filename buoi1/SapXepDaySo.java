package buoi1;
// viet chuong trinh nhap vao danh sach so nguyen . Dem trong danh sach co bao nhieu so x. Sap xep danh sach tang dan
import java.util.Scanner;

public class SapXepDaySo {
	int ds[];
	int n;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong danh sach: ");
		n = sc.nextInt();
		ds = new int[n];
		for(int i=0; i<n; i++) {
			ds[i] = sc.nextInt();
		}
	}
	public int count() {
		System.out.println("Nhap vao so can dem: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(ds[i] == x) cnt++;
		}
		return cnt;
	}
	public void sort() {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(ds[i] > ds[j]) {
					int temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
		for(int e: ds) {
			System.out.print(e + " ");
		}
	}
	public static void main(String[] args) {
		SapXepDaySo t = new SapXepDaySo();
		t.nhap();
		System.out.println("Tong so can dem = " + t.count());
		t.sort();
	}
}
