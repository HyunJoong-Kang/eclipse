package practiceQuiz1;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line = 4;
		int multiple = 1;
		int down = 3;
		
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
			down-=1;
			multiple+=2;
			System.out.println();
		}

	}

}
