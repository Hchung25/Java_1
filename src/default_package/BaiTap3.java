package default_package;

public class BaiTap3 {
	public static long Fibonacci (int n)
	{
		if (n == 1 || n == 2)
			return 1;
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}
