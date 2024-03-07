package dado;
import java.util.*;
public class w3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int G=D(k);
		System.out.println("Input:"+k);
		System.out.println("Output:"+G);

	}
	public static int D(int n) {
		if (n==0) 
			return 1;
		else
			return n+D(n-1);
		
	}
}
