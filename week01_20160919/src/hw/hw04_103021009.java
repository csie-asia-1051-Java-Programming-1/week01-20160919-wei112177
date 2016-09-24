package hw;

/*
 * Topic: 請寫一個程式讓使用者輸入 a 與 b, 程式輸出 a 開 b 次方後的結果，例如 9.0 開 3次方 結果為 2.080083823051904
 * Date: 2016/09/19
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class hw04_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double a = scn.nextDouble();
		double b = scn.nextDouble();
		double x = Math.pow(a, 1 / b);
		System.out.println(x);
	}
}
