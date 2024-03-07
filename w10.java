package dado;
import java.util.Random;
import java.util.*;
public class w10 {

	 public static void main(String[] args) {
		 	Scanner scanner=new Scanner(System.in);
	        // 預定的名字清單
	        String[] name = {"小明", "小華", "小美", "阿杰", "小雨", "小風"};

	        // 使用亂數產生索引
	        int all = everyone(name.length);

	        // 從名字清單中取得隨機選擇的名字
	        String choosename = name[all];

	        // 輸出選擇的名字
	        System.out.println("抽中的名字是：" + choosename);
	    }

	    // 隨機抽取成員
	    private static int everyone(int range) {
	        Random k = new Random();
	        return k.nextInt(range);
	    }
}

