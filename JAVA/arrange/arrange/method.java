package arrange;
import java.util.Scanner;
/*
1. 이름값을 받고 생년월일을 묻는다.
생년월일이 2000미만이라면 1000원, 2000 초과라면 500원, 2000이라면 0원이 나오게 한다. 
*/
public class method {
	public static void main(String[] args) {
		
		double young = 1000;
		double old = 500;
		double guy = 0;
		
		
		Scanner name = new Scanner(System.in);
		System.out.println("what is your name?");
		String yourname = name.next();
		System.out.println("ok your name is : "+ yourname);
		Scanner birth = new Scanner(System.in);
		System.out.println("what is your birth?");
		double yourbirth = birth.nextDouble();
		
		if (yourbirth < 2000) {
			System.out.println("you get a " +young+"원");
		}
		else if(yourbirth > 2000) {
			System.out.println("you get a " +old+"원");
		}
		else System.out.println("you get a " +guy+"원");
		
		name.close();
	}

}
