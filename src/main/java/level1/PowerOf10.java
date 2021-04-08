package level1;

public class PowerOf10 {
	public static void main (String arr[])
	{
		int number=10;
		int exponential =4;
		System.out.println(calculate(number,exponential));
		System.out.println(tocheckPowerOF10(10*10));
		 System.out.println("1000: " + tocheckPowerOF10(1000));
	        System.out.println("4: " + tocheckPowerOF10(4));
	        System.out.println("0: " + tocheckPowerOF10(0));
	        System.out.println("10: " + tocheckPowerOF10(10));
	        System.out.println("100: " + tocheckPowerOF10(100));
	}
	
	private static boolean tocheckPowerOF10(int input) {
		System.out.println("input is : "+input);
		if(input%10!=0 || input==0)
		{
			System.out.println(input%10);
			return false;
		}
		// TODO Auto-generated method stub
		input=input/10;
		if(input==1)
		{
			System.out.println(input);
			return true;
			
		}
		return tocheckPowerOF10(input);
	}

	private static int calculate (int number, int exponentialnumber)
	{
		int result=1;
		while(exponentialnumber>0)
		{
			result=result*number;
			exponentialnumber--;
		}
		return result;
		
	}

}
