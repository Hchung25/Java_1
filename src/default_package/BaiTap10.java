package default_package;

public class BaiTap10 {
	public static void Fibo_PrimeNum(int n)
	{
		int i = 0;
		while(BaiTap3.Fibonacci(i) < n)
		{
			int fibo = (int)BaiTap3.Fibonacci(i);
			if (BaiTap5.isPrimeNumber(fibo))
			{
				System.out.printf("%d " + fibo);
			}
			i++;
		}
	}
}
