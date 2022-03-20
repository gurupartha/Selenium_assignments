package week1.day1;

public class FibonacciSeries {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, range=8, firstNum=0, secNum=1, sum;

		//System.out.println("Fibonacci Series till " + range + " terms:");

		for(i=0;i<range;++i)
		{
			
			
		sum=firstNum+secNum;
			
			System.out.println(firstNum+ ",");
			secNum=firstNum;
			firstNum=sum;


		}

	}
}
