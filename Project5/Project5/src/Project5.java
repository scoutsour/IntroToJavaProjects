

public class Project5 {

	public static void main (String [] args)
	{
		int tokenAmount;
		System.out.print("Your spin was" + " ");
		int num1 = (int)(Math.random()*10)+1;
		int num2 = (int)(Math.random()*10)+1;
		int num3 = (int)(Math.random()*10)+1;

		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		System.out.print(num3 + ". ");
		System.out.println();
		if(num1==num2 && num2 == num3)
		{
			 tokenAmount = 50;
			
			if (num1 == 7)
			{
				tokenAmount = 500;
			}
			
		}
		else if (num1 == num2 || num2 == num3)
		{
			tokenAmount =+ 3;
			if (num1 == 7 || num3 == 7)
			{
				tokenAmount =+ 15;
			}
		}
		else if (num1 == num3)
		{
			tokenAmount = 3;
			if (num3 == 7)
			{
				tokenAmount = 15;
			}
		}
		
		
		else 
			{tokenAmount =-1;}
		
		System.out.println("You earned " + tokenAmount + " points.");
	

		
	}
		


}
