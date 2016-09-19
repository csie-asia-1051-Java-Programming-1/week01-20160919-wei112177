package ex;

/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class ex02_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		double v2 = (v1 * 0.45359);
		System.out.println(v2);
	}
}
