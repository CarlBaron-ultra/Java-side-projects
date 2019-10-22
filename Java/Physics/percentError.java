//Calculates the percent error

import java.util.Scanner;

public class percentError
{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		
		//float meas1=(float) 0.0044;
		//float meas2=(float) 0.0035998;
		System.out.print("Enter the measured value: ");
		float meas=inp.nextFloat();
		
		System.out.print("\nEnter the accepted value: ");
		float accept=inp.nextFloat();
		
		System.out.print(" "+ plugNchug(meas, accept));
		
		inp.close();
	}
	
	public static float plugNchug(float meas, float accept)
	{
		float t= Math.abs(meas-accept);  //t=|measured1-accepted|
		float solution=(t/accept)*100;//solution=(t/accepted)*100
		return solution;
	}
}