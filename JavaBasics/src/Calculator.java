import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int oped1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		int oped2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Operation:");
		char operation = sc.nextLine().charAt(0);
		float result = 0;
		switch (operation) {
		case '+' :
//			+ true hone pr agle wala execute hoke break lag gaya, isse multiple cases ka single statement kr skte hai
		case '-'  :
			result = (float)oped1 - (float)oped2 ;
			break;
		case '/' :
			result = (float)oped1 / (float)oped2 ;
			break;
		case '*' :
			result = (float)oped1 * (float)oped2 ;
			break;
		default:
			System.out.println("Invalid operation");
			
		}
		System.out.println("The result is" + result);
		
	}

}
