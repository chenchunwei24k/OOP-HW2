import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter a string 1:");
		String str1 = Scan.next();
		System.out.println("Enter a string 2:");
		String str2 = Scan.next();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.equals(str2))	System.out.println("The two strings are the same.");
		else	System.out.println("The two strings are not the same.");
	}

}
