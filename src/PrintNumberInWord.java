import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter a integer:");
		 int num = scan.nextInt();
		 
		 System.out.println("The input integer is ");
		 if(num<1 ||  num >9)	System.out.println("\"OTHER\"");
		 else	System.out.println("\"ONE\"");
	}

}
