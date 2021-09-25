package ex04;

public class NonrectangularArray {

	public static void main(String[] args) {
		int [][] n = {{1},{2,3},{4,5,6}};
		for(int i=0; i<n.length; i++)//使用n.length取得第一維陣列個數
		{
			
			for(int j=0; j<n[i].length; j++)//使用n[i].length取得第一維陣列參考另一個陣列元素
			{
//				System.out.print(n[i][j]+" ");
				System.out.print("n[" +i+ "][" +j+ "]=" +n[i][j] +"\t");
			}
			System.out.println("第" +i+ "列");
		}

	}

}
