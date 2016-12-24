import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a intger:");
		int num = keyboard.nextInt();
		System.out.println("Enter a float point number:");
		float fla = keyboard.nextFloat();
		System.out.println("Enter your name:");
		String str = keyboard.next();
		
		System.out.printf("Hi %s, the multiplicatoin of %d and %.3f is %e ",str,num,fla,num*fla);

	}

}
