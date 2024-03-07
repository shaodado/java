package dado;
import java.util.*;
public class w1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Hello2();
		/*int a=sc.nextInt();
		System.out.println("Input:"+a);
		System.out.print("Output:"+even(a));*/
		int a=sc.nextInt();
		System.out.println("Input:"+a);
		System.out.println("Output:"+Password(a));
	}
	/*public static void Hello2() {
		System.out.print("Hello,Sam!");
	}*/
	/*public static boolean even(int n) {
		if (n%2==0)
			return true;
		else 
			return false;
	}*/
	public static boolean Password(int n) {
		int g=1234;
		if(g==n)
			return true;
		else
			return false;
	}
	
}
