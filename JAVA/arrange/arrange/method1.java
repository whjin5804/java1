package arrange;
/*�������� x�̴�.
 *�Ϸ簡������ 10%�� ������
 *��Ʋ�� ������ 10%���� ���� +1000�� ��������.
 * 
 */

import java.util.Scanner;

public class method1 {

	public static Scanner money = new Scanner(System.in);
	public static int ymoney = money.nextInt();
	public static double day = after1day();
	
	public static void main(String[] args) {
		
		System.out.println("�� ��������?");
		print();
		
	}

	public static void print() {
		System.out.println("����� �������� " + ymoney + "�� �Դϴ�." );
		System.out.println("�Ϸ簡 �������ϴ�. ����� �������� " + (day) +" �� �Դϴ�.");
		System.out.println("��Ʋ�� �������ϴ�. ����� ��������"+ ((day)+1000)+ "���Դϴ�.");
	}

	public static double after1day() {
		double day = ymoney+ymoney*0.1;
		return day;
	}

	
}
