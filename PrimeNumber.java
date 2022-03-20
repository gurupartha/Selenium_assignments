package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input =13;
		
		boolean flag =false;
		for(int output = 2; output >= input / output; output++)
		{
			if(input % output == 0) 
			{
					flag = true;
					break;
			}
		}
        if(flag != true)
        {
        	System.out.println(input + " is a Prime Number");
        }
        else
        {
        	System.out.println(input + " is not Prime Number");
        }
	}

}
