package J;

public class Class08 {
	
	public static void main(String args[]) {
		CWin cw1 = new CWin();
		CWin cw2 = new CWin();
		
		
	}
}

class CWin{
	static int cnt = 0; //應設為類別變數,這樣才不會因為物件不同而產生出不一樣的數字
	String color;
	int width;
	int height;
	public void count() { //實例或類別變數皆可以
		cnt++;
	}
	public CWin() {
		this("Red",2,2) ;
	}
	public CWin(String str,int w,int h) {
		count();
		color = str;
		width = w;
		height = h;
	}
	public void setZero() {
		cnt = 0;
	}
	public void setValue(int n) {
		cnt = n;
	}
}
