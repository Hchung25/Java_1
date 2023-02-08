package default_package;

public class BaiTap1 {
	public static void giaiPTBac2 (float a, float b, float c)
	{
		// conditions 
		if (a == 0)
		{
			if (b == 0)
				System.out.print("Phuong trinh vo nghiem!");
			else
				System.out.print("Phuong trinh co nghiem x =" + -(c / b));
		}
		// delta
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0)
		{
			System.out.println("Phuong trinh vo nghiem!");
		}
		else if (delta == 0)
		{
			System.out.println("Phuong trinh co 1 nghiem kep x1 = x2 = " + (-b / (2 * a)));
		}else
		{
			System.out.println("Phuong trinh co 2 nghiem phan biet x1 = %d, x2 = %d" + (-b + Math.sqrt(delta) / (2 * a)) + (-b - Math.sqrt(delta) / (2 * a)));
		}
	}
}
