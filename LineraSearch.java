package ex04;
import java.util.Scanner;
public class LineraSearch 
{
	public static void main(String[] args)
	{
		int[] aData = new int [] {5,3,1,2,10,9,4,8,7,6};
//		for (int i : aData) //enhance只能取出陣列的值，無法取出索引，所以要用for
//		{
//			System.out.println(i);
////			System.out.println("第" + (i+1) + "個數" + aData[i] + " ");
//		}
		
		for (int i=0; i<aData.length; i++)
		{
			System.out.print("第" + (i+1) + "個數" + aData[i] + " "); 
			if (i == 4 || i == 9)
			{
				System.out.println();//在索引為4或5是換行
			}
		}
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入要搜尋的數字：");
		int searchNum = scn.nextInt();
		int num = -1;		//num等於-1表示沒有找到這個數字
		
		//進行循序搜尋法，將找到資料的註標值j記錄在num變數中
//		int[] aData = new int [] {5,3,1,2,10,9,4,8,7,6};
		//aData.length = 10
		for (int j=0; j<aData.length; j++)
		{
			if (aData[j] == searchNum)
			{
				num = j;
				break;	//跳出迴圈
			}	
		}	
		
		System.out.println("===========");
		//顯示搜尋結果
		if (num == -1) 
		{	
			System.out.println("沒有這個數字-->" + searchNum);
		}
		else 
		{
			System.out.println(" " + searchNum + "是第" + (num+1) + "個數。" );
		}
		
	}
}
