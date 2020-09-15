package arrange;
/*예수금은 x이다.
 *하루가지나면 10%가 오르고
 *이틀이 지나면 10%오른 값에 +1000이 더해진다.
 * 
 */

import java.util.Scanner;

public class method1 {

	public static Scanner money = new Scanner(System.in);
	public static int ymoney = money.nextInt();
	public static double day = after1day();
	
	public static void main(String[] args) {
		
		System.out.println("얼마 있으세요?");
		print();
		
	}

	public static void print() {
		System.out.println("당신의 예수금은 " + ymoney + "원 입니다." );
		System.out.println("하루가 지났습니다. 당신의 예수금은 " + (day) +" 원 입니다.");
		System.out.println("이틀이 지났습니다. 당신의 예수금은"+ ((day)+1000)+ "원입니다.");
	}

	public static double after1day() {
		double day = ymoney+ymoney*0.1;
		return day;
	}

	
}
