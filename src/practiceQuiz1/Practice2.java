package practiceQuiz1;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int line = 9;
		int down = 3;
		int multiple = 1;
		
		for ( int i = 0; i < line; i++)
		{
			for ( int j = 0; j < down; j++)
			{
				System.out.println(' ');
			}
			for ( int j = 0; j < multiple; j++)
			{
				System.out.print('*');
			}
			for ( int j = 0; j < down; j++)
			{
				System.out.print(' ');
			}
			
			if (i < line / 2)
			{
				down-=1;
				multiple+=2;
			}
			else
			{
				down+=1;
				multiple-=2;
			}
			System.out.println();
			
		}


	}

}
