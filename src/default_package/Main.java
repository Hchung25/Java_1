package default_package;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String... args)
	{
		String option = null;
		boolean exit = false;
		// menu
		showMenu();
		while(true)
		{
			option = sc.nextLine();
			switch (option)
			{
			case "1":
				System.out.println("Nhap vao he so bac 2 cua phuong trinh: ");
				int a = sc.nextInt();
				System.out.println("Nhap he so bac 1 cua phuong trinh: ");
				int b = sc.nextInt();
				System.out.println("Nhap he so tu so cua phuong trinh: ");
				int c = sc.nextInt();
				BaiTap1.giaiPTBac2(a, b, c);
				break;
			case "2":
				System.out.println("Nhap so nguyen can tim giai thua: ");
				int n = sc.nextInt();
				long gt = BaiTap2.giaiThua(n);
				System.out.println("Giai thua cua" + n + "la: " + gt);
				break;
			case "3":
				System.out.println("Nhap thu tu cua so fibonacci can tim: ");
				int index = sc.nextInt();
				System.out.println("Fibonacci thu" + index + "=" + BaiTap3.Fibonacci(index));
				break;
			case "4":
				System.out.println("Nhap so thu nhat: ");
				int first = sc.nextInt();
				System.out.println("Nhap so thu hai: ");
				int second = sc.nextInt();
				System.out.println("UCLN: " + BaiTap4.USCLN(first, second));
				System.out.println("BCNN: " + BaiTap4.BSCNN(first, second));
				break;
			case "5":
				System.out.println("Nhap n: ");
				int lessN = sc.nextInt();
				System.out.println("So nguyen to nho hon" + lessN + ":");
				if (lessN >= 2) {
		            System.out.print(2);
		        }
		        for (int i = 3; i < lessN; i+=2) {
		            if (BaiTap5.isPrimeNumber(i)) {
		                System.out.print(" " + i);
		            }
		        }
		        break;
			case "6":
				System.out.println("Nhap n: ");
				int firstN = sc.nextInt();
				System.out.printf("%d số nguyên tố đầu tiên là: \n", firstN);
				BaiTap6.SNTdautien(firstN);
				break;
			case "7":
				System.out.println("So nguyen to co 5 chu so: ");
				BaiTap7.SNT5ChuSo();
				break;
			case "8":
				System.out.print("Nhap n = ");
		        int sumN = sc.nextInt();
		        System.out.printf("Tong cua cac chu s0 " + "cua %d là: %d", sumN, BaiTap8.totalDigitsOfNumber(sumN));
		        break;
			case "9":
				System.out.println("So thuan nghich co 6 chu so:");
				BaiTap9.ThuanNghich6So();
				break;
			case "10":
				System.out.println("Nhap n: ");
				int fibo_prime = sc.nextInt();
				BaiTap10.Fibo_PrimeNum(fibo_prime);
				break;
			case "0":
				System.out.println("Exited!");
                exit = true;
                break;
			default:
                System.out.println("Lua chon so trong menu!");
                break;
			}
			if (exit)
				break;
			
		}
		showMenu();
	}
	// class show menu
	public static void showMenu()
	{
		System.out.println("1. Giai phuong trinh bac 2!");
		System.out.println("2. Tinh giai thua cua 1 so nguyen nhap vao tu ban phim!");
		System.out.println("3. Tim so Fibonacci thu n!");
		System.out.println("4. Tim UCLN va BCNN!");
		System.out.println("5. Liet ke so nguyen to nho hon n!");
		System.out.println("6. Liet ke n so nguyen to dau tien!");
		System.out.println("7. Liet ke so nguyen to co 5 chu so!");
		System.out.println("8. Tong cac chu so cua 1 so nguyen!");
		System.out.println("9. Liet ke so thuan nghich co 6 chu so!");
		System.out.println("10. Liet ke so Fibonacci nho hon n va la so nguyen to!");
		System.out.println("0. Thoat!");
		System.out.println("This is your choose: ");
	}
}
