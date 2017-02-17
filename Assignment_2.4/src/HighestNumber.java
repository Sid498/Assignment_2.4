import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		
		int FirstNo,SecondNo,ThirdNo;
		//Getting values from User
		System.out.println("Enter First No ");
		Scanner First=new Scanner(System.in);
		FirstNo = First.nextInt();
		
		System.out.println("Enter Second No ");
		Scanner Second=new Scanner(System.in);
		SecondNo = Second.nextInt();
		
		System.out.println("Enter Third No ");
		Scanner Third=new Scanner(System.in);
		ThirdNo = Third.nextInt();
		
		//Checking The highest Value
		if(FirstNo >= SecondNo && FirstNo >= ThirdNo)
		{
			System.out.println("The highest Number is "+FirstNo);
		}
		
		if(SecondNo >= FirstNo && SecondNo >= ThirdNo)
		{
			System.out.println("The highest Number is "+SecondNo);
		}
		if(ThirdNo >= FirstNo && ThirdNo >= SecondNo)
		{
			System.out.println("The highest Number is "+ThirdNo);
		}
	}

}
