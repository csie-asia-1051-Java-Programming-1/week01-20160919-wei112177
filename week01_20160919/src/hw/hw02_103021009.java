package hw;

/* 
 * Topic:請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/24
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class hw02_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		for (int i = 1; i <= 6; i++) {
			Random ran = new Random();
			System.out.println(ran.nextInt(a) + 1);
		}
	}
}
