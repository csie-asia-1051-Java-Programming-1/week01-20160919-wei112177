package ex;

/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class ex01_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int v2 = ((v1 - 32) * 5 / 9);
		System.out.println(v2);
	}
}
