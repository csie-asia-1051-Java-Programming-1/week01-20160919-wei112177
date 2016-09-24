package hw;

/*
 * Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class hw03_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		double a = scn.nextDouble();
		double b = scn.nextDouble();
		double c = scn.nextDouble();
		double d = scn.nextDouble();
		double e = scn.nextDouble();
		double f = scn.nextDouble();

		int v1 = Math.round(Math.round(a));
		int v2 = Math.round(Math.round(b));
		int v3 = Math.round(Math.round(c));
		int v4 = Math.round(Math.round(d));
		int v5 = Math.round(Math.round(e));
		int v6 = Math.round(Math.round(f));

		int sc[] = { v1, v2, v3, v4, v5, v6 };
		int min = sc[0];
		for (int i = 0; i < sc.length; i++) {
			if (sc[i] < min)
				;
		}
		System.out.println(min);
	}
}