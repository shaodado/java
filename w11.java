package dado;
import java.util.*;
public class w11 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String[] names = new String[5]; // 創建一個可以儲存 5 個名稱的陣列

        for (int i = 0; i < names.length; i++) {
            System.out.println("請輸入名稱：");
            names[i] = scanner.nextLine(); // 讀取使用者輸入的名稱並儲存到陣列中
        }

        scanner.close();

        System.out.println("你輸入的名稱是：");
        for (String name : names) {
            System.out.println(name);
        }
		}

}
