package default_package;

public class BaiTap4 {
	public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
	public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
