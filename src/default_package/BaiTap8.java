package default_package;

public class BaiTap8 {
	public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % 10;
            n = n / 10;
        } while (n > 0);
        return total;
    }
}
