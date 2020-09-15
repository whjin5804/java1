package project;

public class Casting {

	public static void main(String[] args) {

		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; //1.1을 강제로 1로바꿈 자동으로 casting한ㄱ ㅓㅅ
		System.out.println(e); 
		
		// 1 to string
		String f = Integer.toString(1);
		System.out.println(f);
	}

}
