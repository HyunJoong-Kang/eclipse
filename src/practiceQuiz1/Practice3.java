package practiceQuiz1;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		if(operator =='+')
		{
			result = num1 + num2;
		}
		else if(operator =='-')
		{
			result = num1 - num2;
		}
		else if(operator == '*')
		{
			result = num1 * num2;
		}
		else if(operator == '/')
		{
			result = num1 / num2;
		}
		else
		{
			System.out.println("연산 오류입니다.");
			return;
		}
		System.out.println("결과는 " + result + "입니다.");

	}

}
