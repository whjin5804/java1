package data;

public class stringApp {

	public static void main(String[] args) {

			System.out.println("hello world"); //string  (character들의 모임)
			System.out.println('h'); //작음따옴표는 특수한 데이터타입 Character >>걍 안쓴다고 보면됩니다.
			System.out.println("h");
			
			System.out.println("hello "
					+ "world");
			
			System.out.println("hello \nworld"); //  \n은 다음줄 n은 newline의 약자
			System.out.println("Hello \"world\"");//Hello "world" \역슬래쉬는 뒤에있는 것을 문자로만들어줌 (escape)
			System.out.println("원호야 안녕".length());
			System.out.println("hello, name ... bye".replace("name", "wonho"));
	}

}
