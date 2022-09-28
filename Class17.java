public class Class17 {
	public static void main(String[] args) {

	}
}

class Namecard {
	private String name;
	private String address;
	private Phone data;

	public Namecard(String s, String s1, String s2, String s3) {
		name = s;
		address = s1;
		data = new Phone(s2, s3); // 初始化phone類別 並使用建構元
	}

	class Phone {
		private String company;
		private String cell;

		public Phone(String s1, String s2) {
			company = s1;
			cell = s2;
		}

		public void show() {
			System.out.println("好友姓名" + name);
			System.out.println("好友地址" + address);
			System.out.println("公司電話" + data.company);
			System.out.println("手機號碼" + data.cell);
		}
	}	
}
