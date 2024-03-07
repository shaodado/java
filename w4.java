package dado;
import java.util.Scanner;
public class w4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Boolean i= banana(a,b,c);
		System.out.println("Input:"+(a)+" "+(b)+" "+(c)+" ");
		System.out.print("Output:"+i);
		
	}
	public static boolean banana (int x, int y, int z) {
		if(z>x+y&&x>z+y&&y>z+x)
			return false;
		else 
			return true;
	}
}
