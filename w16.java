package dado;

public class w16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "Hello, World!";

		// 使用StringBuilder的reverse方法反转字符串
		StringBuilder reversed = new StringBuilder(original).reverse();

		System.out.println("原始字符串: " + original);
		System.out.println("反转后的字符串: " + reversed);
	}
}
