package dado;
import java.util.*;
public class w5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String x= year(a);
		System.out.println("Input:"+a);
		System.out.println("Output:"+x);
	}
	public static String year (int n) {
		String j="是閏年";
		String k="不是閏年";
		if(n%4==0) {
			if(n%100==0) {
				if(n%400==0) {
					return j;
				}else
					return k;
			}else 
				return j; 
		}else 
			return k;
	}
}
