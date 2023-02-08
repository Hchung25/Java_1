package default_package;

public class BaiTap6 {
	public static void SNTdautien(int n)
	{
		int count = 0;
		int i = 2;
		while(count < n)
		{
			if (BaiTap5.isPrimeNumber(i))
			{
				System.out.println(i + " ");
				count++;
			}
			i++;
		}
	}
}
