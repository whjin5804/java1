package arrange;
import java.util.Scanner;
public class notebook{
    public static void main(String[] args){
        
//    	int i = 0;
//    	while ( i < 4 ) {
//    		System.out.println(i);
//    		i++;
//    	}
//    	
//    			System.out.println("hello");
//    	
//    			
//    	int j = 3;
//    	do {
//    		System.out.println(j);
//    		System.out.println(j+1);
//    		j++;
//    	}
//    	while( j <= 5);
//    	
//    	
//    			System.out.println("hello2");
//    			
//    			
//    	for(int x = -1; x < 2; x++)
//    		System.out.println(x);

/*scanner함수로 받고 for문으로 x부터y까지z씩 증가한 합 구하기*/
//Scanner k = new Scanner(System.in);
//
//int hap = 0;
//
//System.out.print("시작값입력:");
//int num1=k.nextInt();
//
//System.out.print("끝값입력:");
//int num2=k.nextInt();
//
//System.out.print("증가값입력:");
//int num3=k.nextInt();
//
//
//for(int i=num1; i<=num2; i=i+num3) {
//	hap=hap+i;
//	
//}
//
//int sum = num1+num2;
//System.out.println(num1+"에서"+num2+"까지"+num3+"씩 증가한 값의 합:"+hap);
//    		

/*구구단*/

// for(int i = 1; i <=9; i++) {
//	 for(int j = 1; j <=9; j++) {
//		 int sum = i*j;
//		 System.out.println(i + "*" + j + "=" + (i*j));
//		 System.out.println(sum);
//	 }
// }
// 
    	int [][] my = { {1,2,3,4}, {5,6,7}, {0,0} };
    	for (int i =0; i < my.length; i++) {
    		for(int j =0; j <my[i].length; ++j) {
    			System.out.println(my[i][j]);
    		}
    		System.out.println(my.length);
    	}

}
    	
    }
