package ex01;

import java.util.Scanner;

/**這是主類別hi */
public class hi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入姓名");
		String strName = scn.next();
		System.out.println("Hi!" + strName + "welcome to Java");
		scn.close();
	}

}
