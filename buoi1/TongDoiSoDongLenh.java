package buoi1;
// mo run as + argument + nhap vao program counter
// viet chuong trinh tinh tong doi so dong lenh
public class TongDoiSoDongLenh {
	public static void main(String[] args) {
		float sum = 0;
		float n;
		for(String s : args ) {
			try {
				n = Float.parseFloat(s);
			} catch (Exception e) {
				n = 0.0f;
			}
			sum += n;
		}
		System.out.println("Tong cua doi so dong lenh = " + sum);
	}
}
