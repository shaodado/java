package dado;
import java.util.*;
public class w2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int H=password(a,b);
		System.out.println("Input:"+(a)+" "+(b));
		System.out.println("Output:"+H);
	}
	public static int password(int n, int k) {
		
	if(n==k) 
		return 1;
	
	else 
		return 0;
	
	
    }

}
