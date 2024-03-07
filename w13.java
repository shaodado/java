package dado;

import java.util.*;
import java.util.ArrayList;
import java.util.Random.*;

public class w13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		//ArrayList<String> studentsname = new ArrayList<String>();
		System.out.println("輸入小組數量"+" "+"至多6組");
		int team=sc.nextInt();
		System.out.println("輸入組員數量"+" "+"至多4組");
		int studentsnuber=sc.nextInt();
		String teamnuber[]= new String[team];
		String students[]= new String[studentsnuber];
		int i;
		for( i=0; i<team; i++) {
			System.out.println("第"+(i+1)+"組");
			for(int j=0; j<studentsnuber; j++) {
			System.out.println("成員"+(j+1)+"名稱");
			students[j]=sc.next();
			}
		}
		System.out.print("輸入想抽取的組 選擇小組 輸入0退出");
		int teamnuber1=sc.nextInt();//k為使用者輸入之值
		int team2=everyone(i);
		String name= students[team2];
	
		switch(teamnuber1) {
		case 1:
			System.out.println("您抽的是第1組");
			System.out.println("抽中的成員是 "+name);
			break;	
		}
		/*if(k==1)
		{
			System.out.println("您抽的是第1組");
			System.out.println("抽中的成員是 "+name1);
		}*/
		/* if(k==2)
		{
			System.out.println("您抽的是第2組");
			System.out.println("抽中的成員是 "+team2);
		}
		else if(k==0) 
			System.exit(0);
		else
			System.out.println("輸入錯誤");*/
		//判斷抽取組別
		/*System.out.println("小組一人數");
		int a=sc.nextInt();
		String arry1 []= new String[a];//分組成員
		for (int i = 0; i < arry1.length; i++) {
            System.out.println("請輸入名稱：");
            arry1[i] = sc.next(); // 讀取使用者輸入的名稱並儲存到陣列中
        }
		System.out.println("小組二人數");
		int b=sc.nextInt();
		String arry2 []= new String[b];//分組成員
		for (int i = 0; i < arry2.length; i++) {
            System.out.println("請輸入名稱：");
            arry2[i] = sc.next(); // 讀取使用者輸入的名稱並儲存到陣列中
        }
		System.out.print("輸入想抽取的組 選擇小組 輸入0退出");
		int k=sc.nextInt();//k為使用者輸入之值
		
			int team1=everyone(arry1.length);
			String name1= arry1[team1];
			int team2=everyone(arry2.length);
			String name2= arry2[team2];
			if(k==1)
			{
				System.out.println("您抽的是第1組");
				System.out.println("抽中的成員是 "+name1);
			}
			else if(k==2)
			{
				System.out.println("您抽的是第2組");
				System.out.println("抽中的成員是 "+name2);
			}
			else if(k==0) 
				System.exit(0);
			else
				System.out.println("輸入錯誤");
			//判斷抽取組別
		
		
	}*/

	private static int everyone(int range) 
	{
	        Random k = new Random();//隨機取樣
	        return k.nextInt(range);
	}
	
}
/*
 * 
 * Scanner scanner = new Scanner(System.in); String[] names = new String[5]; //
 * 創建一個可以儲存 5 個名稱的陣列
 * 
 * for (int i = 0; i < names.length; i++) { System.out.println("請輸入名稱：");
 * names[i] = scanner.nextLine(); // 讀取使用者輸入的名稱並儲存到陣列中 }
 * 
 * scanner.close();
 * 
 * System.out.println("你輸入的名稱是："); for (String name : names) {
 * System.out.println(name); }
 */