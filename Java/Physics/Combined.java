//Calculates the percent difference and or the percent error

import java.util.Scanner;

public class Combined
{
	public static void main(String[] args)
	{
		int condition=1;
		do
		{
			Scanner choice=new Scanner(System.in);

			System.out.print("Enter 1 for percent difference, Enter 2 for percent error: ");
			int userInput=choice.nextInt();

			if(userInput==1)
			{
				percentdif();
			}
			else if(userInput==2)
			{
				percenterror();
			}
			else//invalid input
			{
				System.out.print("\n");
				System.out.println("invalid input\n");
				continue;
			}


			condition=runAgain();//see if the user wants to run the program again
			while(condition==3)//if user enters a invalid input ask again
			{
				condition=runAgain();
			}


		}while(condition==1);

	}

	public static int runAgain()
	{

		System.out.print("\n");

		System.out.println("Would you like to run the program again 1=yes 2=no: ");
		Scanner repeat=new Scanner(System.in);
		int choice=repeat.nextInt();

		if(choice==1)//yes
		{
			return choice;
		}
		else if(choice==2)//no
		{
			return choice;
		}
		else//invalid input
		{
			System.out.print("\n");
			System.out.print("invalid input");
			return choice=3;
		}

	}

	public static void percentdif()//calculates the percent difference
	{
		Scanner inp=new Scanner(System.in);

		System.out.print("Enter the first measured value: ");
		float meas1=inp.nextFloat();

		System.out.print("Enter the second measured value: ");
		float meas2=inp.nextFloat();

		float t= Math.abs(meas1-meas2);  //t=|measured1-measured2|
		float b=Math.abs((meas1+meas2)/2);//b=|(measured1+measured2)/2|
		float solution=(t/b)*100;//solution=(t/b)*100

		System.out.print("The percent difference is "+ " "+ solution+"\n");

		return;
	}

	public static void percenterror()//calculates the percent error
	{
		Scanner inp=new Scanner(System.in);

		System.out.print("Enter the measured value: ");
		float meas=inp.nextFloat();

		System.out.print("Enter the accepted value: ");
		float accept=inp.nextFloat();

		float t= Math.abs(meas-accept);  //t=|measured1-accepted|
		float solution=(t/accept)*100;//solution=(t/accepted)*100

		System.out.print("The percent error is " +" "+ solution+"\n");

		return;
	}
}