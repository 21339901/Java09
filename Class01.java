import java.util.*;

public class Class01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CRectangle cr = new CRectangle();
		System.out.print(cr.height  + " "+ cr.width);
	}
}
class CRectangle{
	int width;
	int height;
	public CRectangle(int w,int h){
		width = w; 
		height = h;
	}
	public CRectangle() {
		this.width = 10;
		this.height = 8;
	}
}
