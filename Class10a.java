package Java11;

public class Class10a {
	
	public static void main(String args[]) {
		CRational aaa = new CRational();
		aaa.setN(2);
		aaa.setD(5);
		aaa.show();
		CRational bbb = new CRational();
		bbb.setND(3,4);
		bbb.show();
	}
}

class CRational{
	public int n;
	public int d;
	
	public void setN(int num) { //son
		n = num;
	}
	
	public void setD(int num) { //mother
		d = num;
	}
	
	public void setND(int num,int den) {
		n = num;
		d = den;
	}
	
	public void show() {
		System.out.println(n+"/"+d);
	}
}
