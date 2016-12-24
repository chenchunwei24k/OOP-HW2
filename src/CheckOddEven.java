import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter a integer:");
		int num = S.nextInt();
		if(num%2 == 0)	System.out.println("The input integer is Even Number");
		else	System.out.println("The input integer is Odd Number");
	}

}
