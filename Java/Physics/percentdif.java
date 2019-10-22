//Calculates the percent difference

import java.util.Scanner;

public class percentdif
{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		
		//float meas1=(float) 0.0044;
		//float meas2=(float) 0.0035998;
		System.out.print("Enter the first measured value: ");
		float meas1=inp.nextFloat();
		
		System.out.print("\nEnter the second measured value: ");
		float meas2=inp.nextFloat();
		
		System.out.print(" "+ plugNchug(meas1, meas2));
		
		inp.close();
	}
	
	public static float plugNchug(float meas1, float meas2)
	{
		
		float t= Math.abs(meas1-meas2);  //t=|measured1-measured2|
		float b=Math.abs((meas1+meas2)/2);//b=|(measured1+measured2)/2|
		float solution=(t/b)*100;//solution=(t/b)*100
		return solution;
	}
}