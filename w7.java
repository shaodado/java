package dado;

public class w7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			for(int j=0; j<=5-i; j++) {
				System.out.println(" ");
			}
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}

}
