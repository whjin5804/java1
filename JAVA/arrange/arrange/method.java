package arrange;
import java.util.Scanner;
/*
1. �̸����� �ް� ��������� ���´�.
��������� 2000�̸��̶�� 1000��, 2000 �ʰ���� 500��, 2000�̶�� 0���� ������ �Ѵ�. 
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
			System.out.println("you get a " +young+"��");
		}
		else if(yourbirth > 2000) {
			System.out.println("you get a " +old+"��");
		}
		else System.out.println("you get a " +guy+"��");
		
		name.close();
	}

}
