package default_package;
import java.util.ArrayList;
import java.util.List;
public class BaiTap9 {
	public static boolean isThuanNghich(int n) {
        List<Integer> listNumbers = new ArrayList<>();
        do {
            listNumbers.add(n % 10);
            n = n / 10;
        } while (n > 0);
        int size = listNumbers.size();
        for (int i = 0; i < (size/2); i++) {
            if (listNumbers.get(i) != listNumbers.get(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
	public static void ThuanNghich6So()
	{
		for (int i = 100000; i < 1000000; i++) {
            if (isThuanNghich(i)) {
                System.out.println(i);
            }
        }
	}
}
