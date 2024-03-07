package dado;
import java.util.*;
public class w6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []arry={8,6,9,12,47,55,10};
		System.out.print("Output:");
		for(int i=0; i<arry.length; i++) {
			System.out.print(arry[i]+" ");
		}
		System.out.println();
		int x=banana(arry);
		int y=watermalen(arry);
		System.out.println("最大值:"+x);
		System.out.println("最小值:"+y);
		
	}
	public static int banana(int arry[]) {
		int min=arry[0];
		for(int i=0; i<arry.length; i++) {
			if(min<arry[i])
				min=arry[i];
			
		}
		return min;
	}
	public static int watermalen(int arry[]) {
		int max=arry[0];
		for(int i=0; i<arry.length; i++) {
			if(max>arry[i])
				max=arry[i];
			
		}
		return max;
	}
}
//if(max<arry[i])
//max=arry[i];
