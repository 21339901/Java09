package Java09;

public class Class10b {
		public static void show(CRational cr) {
			System.out.println(cr.n+"/"+cr.d);
		}
	public static void main(String args[]) {
		CRational aaa = new CRational();
		aaa.setN(2);
		aaa.setD(5);
		show(aaa);
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
}
