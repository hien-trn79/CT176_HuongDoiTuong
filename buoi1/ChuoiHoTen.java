package buoi1;
import java.util.Scanner;

public class ChuoiHoTen {
	public String layTen(String name) {
		return name.substring(name.lastIndexOf(" "));
	}
	public char toUp(char c) {
		if(c > 'a' && c <'z') c-=32;
		return c;
	}
	public String chuanHoa(String name) {
		name = name.trim().toLowerCase();
		String temp[] = name.split(" ");
		String ten = "";
		char[] c;
		for(String s: temp) {
			if(!s.isEmpty()) {
				c = s.toCharArray();
				c[0] = toUp(c[0]);
				s = new String(c);
				ten += s + " ";
			}
		}
		return ten.trim();
	}
	public String nhap() {
		System.out.println("Nhap Ho va Ten");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		name = chuanHoa(name);
		return name;
	}
	public static void main(String[] args) {
		ChuoiHoTen t = new ChuoiHoTen();
		String name = t.nhap();
		System.out.println("Ho va ten: " + name);
		System.out.println("Ten: "+ t.layTen(name));
	}
}
