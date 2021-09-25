package ex04;

public class BubbleSort {

	public static void main(String[] args) {
		int[] aNum = {32,24,11,48,15};
		System.out.print("排 序 前");
		
		//aNum.length=5
		for (int a=0; a<aNum.length; a++)//取出aNum裡面的所有值
		{
			System.out.print(" " + aNum[a] + "\t");
		}
		System.out.println();
		System.out.println();
		
		int n = aNum.length;//aNum.length=5
		int t;
		for (int i=n-2; i>=0; i--)//i=3;迴圈循環4次。-2如何推斷出？
		{
			for (int j=0; j<=i; j++)//swap
			{
				if (aNum[j] > aNum[j+1])
				{
					t = aNum[j];
					aNum[j] = aNum[j+1];
					aNum[j+1] = t;
				}
			}
			System.out.print("第"+(4-i)+"次循環");//i從3開始--
			for (int a=0; a<aNum.length; a++)//aNum.length=5
			{
				System.out.print(" " + aNum[a] + "\t");//印出排序的數字
			}
			System.out.println();
		}
		System.out.print("排 序 後 ");
		for (int a=0; a<aNum.length; a++)
		{
			System.out.print(" "+aNum[a]+ "\t");
		}

	}

}
