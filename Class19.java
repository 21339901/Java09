package Java9;

public class Class19 {
		
	public static void main(String args[]) {
		Data data = new Data("Annie",85,92);
		data.show();
	}
}

class Data{
	private String name;
	private Test score;
	public Data(String name,int e,int m) {
		this.name = name; 
		score = new Test(e, m);
				
	}
	void show() {
		System.out.println("學生姓名:"+name+"\n英文成績="+score.english+ "\n數學成績="+score.math+"\n平均成績="+this.score.avg());
	}
	public class Test{
		int english;
		int math;
		public Test(int eng,int m) {
			english = eng;
			math = m;
		}
		double avg() {
			return ((english+math)/2.0);
		}
	}
}
