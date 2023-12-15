package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap gia tri a: ");
		a = sc.nextInt();
		System.out.println("nhap gia tri b:");
		b = sc.nextInt();
		int Tong = a + b;
		int Hieu = a-b;
		int Tich = a*b;
		int Thuong = a/b;
		System.out.println("Tong la " +Tong);
		System.out.println("Hieu la " +Hieu);
		System.out.println("Tich la " +Tich);
		System.out.println("Thuong la " +Thuong);
		boolean c;
		c=a>b;
		c=a<b;
		c=a>=b;
		c=a<=b;
		System.out.println("Ket qua so sanh la: "+a+"va"+b+"la"+(a>b));
		System.out.println("ket qua so sanh la: "+a+"va"+b+"la"+(a<b));
		System.out.println("Ket qua so sanh la: "+a+"va"+b+"la"+(a>=b));
		System.out.println("Ket qua so sanh la: "+a+"va"+b+"la"+(a<=b));
	}

}
