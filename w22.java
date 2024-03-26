package dado;
class CRect{
	private int height=5,width=5;
	public CRect(int h, int w) {
		this.height=h;
		this.width=w;
	}
	public int calLenght(){	
		return 2*(height+width);
	}
	public int calArea(){
		 return height*width;
	}
	 
}
public class w22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRect[] a=new CRect[4];
		a[0]=new CRect(5,5);
		a[1]=new CRect(3,5);
		a[2]=new CRect(10,15);
		a[3]=new CRect(8,7);
		for(int i=0; i<a.length;i++) {
			a[i].calLenght();
			a[i].calArea();
			
		}
	
	}
int a=0;
}
CRect a=new CRect();
int a[]=new int[2];
