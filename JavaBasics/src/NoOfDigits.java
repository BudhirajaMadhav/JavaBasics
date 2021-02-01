import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		int n  = sc.nextInt();
		
		int NoOfDigits = (int) Math.log10(n) + 1;
		System.out.println(NoOfDigits);
		
	}

}
