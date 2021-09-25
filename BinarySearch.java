package ex04;
import java.util.Scanner;
public class BinarySearch 
{
	public static void main(String[] args)
	{
		int[] aNum = new int[9];//(陣列長度為9，索引為0~8)
		//產生1~99的9個亂數，放入aNum陣列中(陣列長度為9，索引為0~8)
		for (int i=0; i<aNum.length; i++)
		{
			aNum[i] = (int)(Math.random()*100)+1;//Math.random()產生0.0以上1.0未満の擬似乱数double
		}
		
		System.out.print("排序前：");//印出「排序前」
		//用Enhance取出陣列aNum的值，放入a中(排序前的值)
		for (int a: aNum)
		{
			System.out.print(a + " ");
		}
		System.out.println();
		int n = aNum.length;
		int t;
		
		//進行氣泡排序法
		for (int i=n-2; i>=0; i--)
		{
			for (int j=0; j<=i; j++)
			{
				if (aNum[j] > aNum[j+1])
				{
					t = aNum[j];
					aNum[j] = aNum[j+1];
					aNum[j+1] = t;
				}
			}
		}
		
		System.out.print("排序後：");//印出「排序後」
		//用Enhance取出陣列aNum的值，放入a中(排序後的值)
		for (int a: aNum)
		{
			System.out.print(a + " ");
		}
		
		System.out.println();//換行
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入要搜尋的數字：");
		int sNum = scn.nextInt();//sNum為輸入的值(搜尋資料)
		int num = -1;   //設為-1表示沒有找到資料
		int low = 0;	//下界值(=0)
		int high = aNum.length - 1;	//上界值
		int midNum = 0; //midNum為陣列的中間註標
		do 
		{
			midNum = (low + high) / 2;//計算出中間索引值
			//aNum為排序後的陣列
			//sNum為輸入的值(搜尋資料)
			// //midNum為陣列的中間註標
			
			//如果排列中間索引的值=輸入的值(搜尋資料)，把中間的索引值代入num
			if (aNum[midNum] == sNum)//如果排列中間索引的值=輸入的值
			{
				num = midNum;//把中間的索引值代入num
				break;//離開迴圈
			}
			//如果排列中間索引的值>輸入的值(搜尋資料)，就重設上界值high = midNum - 1;
			if (aNum[midNum] > sNum)//如果排列中間索引的值>輸入的值(搜尋資料)
			{
				//int high = aNum.length(9) - 1;	//上界值(8)
				high = midNum - 1;//，就重設上界值high = midNum - 1;
			}
			else
			{
				//int low = 0;	//下界值(=0)
				low = midNum + 1;//否則重設下界值low = midNum + 1;
			}
			
		}while(low <= high);
		if (num == -1)
		{
			System.out.println("沒有" + sNum+ "這個數字");
		}
		else
		{
			System.out.println("排序後找到" + sNum + "是第" + (num+1) + "個數字");
		}
		
	}

}
