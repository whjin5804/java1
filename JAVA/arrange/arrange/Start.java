//공부시간이 1시간 이상일 경우 오레오 1개, 휴식 10분, 공부시간이 1시간 미만일 경우 오레오0개, 휴식 없음
package arrange;

import javax.swing.JOptionPane; 
public class Start {

	public static void main(String[] args) {
		
		
		
		double studytime = 5000;
		String a = "oreo ";
		String c = "You can eat ";
		double b = 1;
		
		c= JOptionPane.showInputDialog("How long study time? ");
		
		if (studytime >= 1000 & studytime < 2000) {
			System.out.println(c + a+"number" +b);
			
		}
		else if (studytime >= 2000 & studytime < 2000) {
			System.out.println(c+"2" + a);
		}
		else if (studytime >= 3000) {
			System.out.println(c+"3" + a);
		}
		else System.out.println("study more");
		
		

	}


}
