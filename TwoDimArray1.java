package ex04;

public class TwoDimArray1 
{
	public static void main(String[] args) 
	{
		int[][] n = {{0,1,2,3},{4,5,6,7},{8,9,10,11,}};//宣告建立一個3x4的二維陣列
		int sum = 0;
		for (int i=0; i<n.length; i++)//n.length會取得一維陣列的元素3個
		{
			for(int j=0; j<n[0].length; j++)//n[0].length會取得二維陣列的元素4個
			{
				System.out.print("n[" +i+ "][" +j+ "]=" +n[i][j] +"\t");
				sum += n[i][j];//sum = sum + n[i][j]
			}
			System.out.println();
		}
		System.out.println("n陣列元素總和為"+ sum);
	}

}
