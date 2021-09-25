package ex04;

import java.util.Arrays;

public class TwoDimArray2 
{
	public static void main(String[] args) 
	{
		int[][] n = {{0,1,2,3},{4,5,6,7},{8,9,10,11,}};//宣告建立一個3x4的二維陣列
		int sum = 0;
		//for(陣列資料型別 變數名稱 : 陣列名稱)，Enhanced for-Loops
		for (int[] r:n)//陣列r取得陣列n的每個資料，也就是陣列r={0,1,2,3},{4,5,6,7},{8,9,10,11,}
		{
			//for(陣列資料型別 變數名稱 : 陣列名稱)，Enhanced for-Loops
			for(int i:r)//整數i，取得陣列r的每個資料0~12的每一個整數
			{
				System.out.print(i+",");
				sum += i;//sum = sum + n[i][j]
			}
			System.out.println();
			System.out.println();
			System.out.println(Arrays.toString(r));//陣列array轉化成字串string
			System.out.println();
		}
		System.out.println(Arrays.deepToString(n));//使用 Arrays.deepToString() 方法列印。如果陣列中有其它陣列，即多維陣列，也會用同樣的方法深度顯示。
		System.out.println("n陣列元素總和為"+ sum);
	}

}
