package ex04;
import java.util.Arrays;
import java.util.Scanner;

public class Order {
	public static void main(String[] args)
	{
		String[][] menu = {{"凱薩沙拉","和風沙拉"},{"香煎雞腿","經典牛排","海陸雙拼"},{"綠茶","咖啡","柳橙汁","冰醋"}};
//		String[][] menu = new String[3][];
//		menu[0] = new String[] { "凱蕯沙拉", "和風沙拉" };
//		menu[1] = new String[] { "香煎腿排", "經典牛排", "海陸雙拼" };
//		menu[2] = new String[] { "綠茶", "咖啡", "柳橙汁", "冰醋" };
		
		int[] sel = new int[] {0,0,0};//建立sel整數陣列，來記碌使用者選擇項目的註標值，初值預設為0
		Scanner scn = new Scanner(System.in);
		for (int i=0; i<menu.length; i++)//表示第一維陣列前菜，主餐，飲料三個項目
		{
			System.out.println("**請選擇**");
			for (int j=0; j<menu[i].length; j++)//表示第二維陣列內的每一個項目
			{
				System.out.println(menu[i][j] + "->輸入" + (j+1));
			}
			sel[i] = scn.nextInt() - 1;//輸入值減1，表註標值(索引值)
		}
		System.out.println("**您選擇**");
		System.out.printf("前菜：%s，主餐：%s，飲料：%s",menu[0][sel[0]],menu[1][sel[1]],menu[2][sel[2]] );
		System.out.println();
		System.out.println(Arrays.toString(sel));
		scn.close();
	}
}
