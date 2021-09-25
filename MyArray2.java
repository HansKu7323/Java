package ex04;

/**這是主類別hi */
public class MyArray2 
{

	public static void main(String[] args) 
	{
		int [] score = new int[] {56, 75, 68, 32, 90, 80};
		int pass = 0;
		//for(陣列資料型別 變數名稱 : 陣列名稱)
		for ( int s : score)//陣列的值，一個個丟進s裡面
		{
			if (s >= 60)
			{
				pass++;
			}
			System.out.println(s);
			
		}
		System.out.println(score.length);
		System.out.println("及格學生人數：" + pass);
	}
	

}
