package dado;
import java.util.ArrayList;
import java.util.Scanner;

public class w12{
    public static void main(String[] args) {
        // 创建一个ArrayList来存储用户输入的整数
        ArrayList<Integer> numbers = new ArrayList<>();

        // 创建一个Scanner对象来接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入整数，输入负数结束输入
        System.out.println("请输入整数，输入负数结束输入:");

        // 使用循环读取用户输入，直到输入负数为止
        while (true) {
            System.out.print("请输入一个整数: ");
            
            // 检查是否有下一个整数输入
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                
                // 检查是否为负数，如果是，则结束循环
                if (userInput < 0) {
                    break;
                }
                
                // 将用户输入的整数添加到ArrayList中
                numbers.add(userInput);
            } else {
                // 如果输入不是整数，提示用户重新输入
                System.out.println("请输入有效的整数!");
                // 清除缓冲区中的非整数输入
                scanner.next();
            }
        }

        // 输出ArrayList中的元素
        System.out.println("输入的整数列表为: " + numbers);

        // 关闭Scanner对象
        scanner.close();
    }
}