package week1.day1;

public class Problemstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=-40,  positiveNumber;
		
		if(number<0)
		{
			positiveNumber = number * (-1);
			System.out.println("The number " +number+ " is converted to "+positiveNumber );
		}
		int number1 =30,negativeNumber;
		
		if (number1>0)
		{
			negativeNumber = number1 * (-1);
			System.out.println("The number " +number1+ " is converted to "+negativeNumber );
	
			
		}
		else if(number>0)
		{
			System.out.println(number1+"is positive");
		}
		else
		{
			System.out.println(number1+"is neither negative nor positive");
		}

	}
}


