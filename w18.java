package dado;
import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner; 
public class w18 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	ArrayList<String>name = new ArrayList<String>();
	name.add("12131111 xxx");
	name.add("12132222 aaa");
	name.add("12133333 aaa");
	name.add("12134444 aaa");
	name.add("12135555 aaa");
	System.out.println(everyone(range));
	}
	public static int everyone(String range) 
	{
	        Random k = new Random();//隨機取樣
	        return k.nextInt(range);
	}
	
}
