package ex04;
import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
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
		Arrays.sort(aNum);
		System.out.print("排序後：");
		for (int n:aNum)
		{
			System.out.print(n + ",");
		}

	}

}
