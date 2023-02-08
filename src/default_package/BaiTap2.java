package default_package;

public class BaiTap2 {
	public static long giaiThua(int a)
	{
		if (a == 1)
			return 1;
		return (a * giaiThua(a - 1));
	}
}
