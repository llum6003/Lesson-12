package lesson12;

public class lesson12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Continue Statement");
		for (int j=0; j<=6; j++)
		{
			if (j==4)
			{
				continue;
			}

			System.out.print(j+" ");
		}


		System.out.println("\n\nContinue Statement In While Loop");
		int counter=10;
		while (counter >=0)
		{
			if (counter==7)
			{
				counter--;
				continue;
			}
			System.out.print(counter+" ");
			counter--;
		}


		System.out.println("\n\nContinue Statement in Do-While Loop");
		int j=0;
		do
		{
			if (j==7)
			{
				j++;
				continue;
			}
			System.out.print(j+ " ");
			j++;
		}while(j<10);
	}
}
