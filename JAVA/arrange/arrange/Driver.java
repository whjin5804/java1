
package arrange;

import java.util.Scanner; //Scanner class를 불러온다.
import java.text.*; //decimal format을 써주기위함

public class Driver {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 							//입력되는 키를 byte로 반환 키보드와 연결되어있어 입력값을 읽고 원하는 타입으로 변환하여 리턴
		System.out.println("Enter your buying price per share:"); 		
		double buyingPrice = scan.nextDouble();							//입력값을 받는다, 처음으로 입력값이 buyingPrice가 되고 이 값이 계속 유지됨.
		int day = 1;
		DecimalFormat df = new DecimalFormat("0.00"); 					// 소수점은 첫번쨰 자리부터 쉼표.을 찍는다.
		
		while (true) {													 /*조건이 true이기에 무한 반복*/
			System.out.println("Enter the closing price for day"	
					+ day + "(any negative value to leave : ");			//scanner 클래스에 올 문자를 작성 day는1로 명시되어있다.
		double closingPrice = scan.nextDouble();						//입력값이 closingPrice가되고 이 값으로 if문을 실행한다.
		if (closingPrice < 0.0) break; 									//closingPrice가 0보다 작으면 멈춘다.
		
		double earnings = closingPrice - buyingPrice;					//earnings을 명시한다.
		if (earnings > 0.0) {											//earnings가 0보다 큰것이 true라면 {}값을 실행한다.
			System.out.println("After day" + day + ", you earned"
					+ df.format(earnings) + " per share.");				//df.format으로 소수점일 경우 첫번째 자리부터 쉼표를 찍는다.
			
		}
		
		else if (earnings < 0.0) {										//earnings가 마이너스라면 즉, closingPrice가 더 작다
			System.out.println("After day" + day + ", you lost"			
					+ df.format(-earnings) + " per share.");			//-를 붙임으로써 closingPrive-buyingPrice로 나온 음수값을 양수로 바꿔준다. 즉 -를 붙이지않으면 you lost -x.xxper share가 나온다.
			
			}
		else {
				System.out.println("After day" + day + ", you have" + 	//0보다 큰값도, 0보다 작은 값도 아닌값이라면 이와같은 문구가 나온다.
							"no earnings per share.");
			}															//else닫는다.
			day += 1;													//day를 하루 더해준다. while 값이 true인지 확인하러간다.
		}																//while을 닫는다.
		
		scan.close();
	}
}
