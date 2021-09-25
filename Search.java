package ex04;
import java.util.*;
//import java.util.Arrays;
//import java.util.Scanner;
public class Search 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String[] aName = {"Jerry", "Jack", "Winnie", "Max", "Amy", "Peter", "Tony"};
		System.out.print("排序前：");
		//用enhanced，取出aName陣列排序後的值
		for (String name:aName)
		{
			System.out.print(name + ", ");
		}
		
		//用for，取出aName陣列裡的值
//		for (int i=0; i<aName.length; i++)
//		{
//			System.out.print(aName[i] + ", ");
//		}
		System.out.println();
		Arrays.sort(aName);//用Arrays.sort()方法，將aName陣列做遞增排序
		System.out.print("排序後：");
		//用enhanced，取出aName陣列排序後的值
		for (String name:aName)
		{
			System.out.print(name + ", ");
		}
		
		//用for，取出aName陣列排序後的值
//		for (int i=0; i<aName.length; i++)
//		{
//			System.out.print(aName[i] + ", ");
//		}
		System.out.println();
		System.out.print("請輸入搜尋值∶");
		String sName = scn.nextLine();
		int find = -1;//傳回值存在find變數中
		
		/*
		用binarySearch方法，在aName陣列中搜尋輸入值sName，並將傳回值存在find變數中
		如果find>-1表示搜尋到資料，就顯示所在的陣列註標值：否則就顯示找不到訊息
		(binarySearch方法搜尋不到資料，傳回值會<=-1)
		*/
//binarySearch()語法=>Arrays.binarySearch(陣列名稱,搜尋值)
		if ((find = Arrays.binarySearch(aName, sName)) > -1)
		{
			System.out.print("找到" + sName + "位於註標(索引)" + find + "處");
		}
		else
		{
			System.out.println("找不到" + sName);
		}
		
			
		
		
	}
}
