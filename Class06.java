package Java09;

public class Class06 {
	
	public static void main(String args[]) {
		Count cnt = new Count();
		System.out.println("一加到五="+cnt.add2n(5));
		System.out.println("一加到十="+cnt.add2n(10));
	}
}

class Count{
	int x;
	public int add2n(int n) {
		x = 0;
		for(int i=1;i<=n;i++) {
			x += i;
		}
		return x;
	}
}
