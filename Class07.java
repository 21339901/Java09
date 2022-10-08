package Java09;

public class Class07 {
	public static void main(String[] args) {
		Power P =  new Power();
		P.power(2,5);
		P.power(3,2);
}
}
class Power{
	void power(int a,int b) {
		System.out.println(a+" ** "+b+" = "+ Math.pow(a, b));
	}
}
