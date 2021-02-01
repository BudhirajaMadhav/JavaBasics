//import java.awt.List;
//import java.util.Scanner;

//import com.sun.tools.sjavac.server.SysInfo;

public class FirstJavaClass {

	public static void main(String[] args) {
		
//		System.out.println("Madhav");
//		// TODO Auto-generated method stub
//		// int, float, char, String, long, double
//		int age = 17;
//		
//		// keyword =>> _,$,alnum, can't start with num
//		float averageMarks = 19.54f;
//		char Grade = 'A';
//		String name = "Madhav";
//		boolean isValid = false;
//		long bigNumber = 65985461619l;
//		System.out.println(age);
//
//	
//		//// OPERATORS
//		//Arithmatic +,-,*,/,%,++,--
//		
//		int firstNumber = 148;
//		int secondNumber = 215;
//		
//		int sum = firstNumber + secondNumber;
//		System.out.println(sum);
//		
//		//picking only floor(int)
//		
//		int sum2 = firstNumber / secondNumber;
//		System.out.println(sum2);
//		
//		// for exact float = double
//		
//		double sum3 = (double)firstNumber / (double)secondNumber; // type casting
//		System.out.println(sum3);
//		
//		
//		//++ increment -- decrement
//		int a = 12;
//		a++; // a = a + 1 (increments 1 from next line)
//		System.out.println(a);
//		a--;
//		System.out.println(a);
//		System.out.println(++a);
//		
//		// Taking User Input
//		Scanner sc = new Scanner(System.in); //input lene ke liye ye line likhni  hogi
//		
//		System.out.println("Enter ur name:" );// only 1 argument can pass print
//		
//		String name1  = sc.nextLine(); // nextInt for int, nextFloat for float
//		System.out.println(name1);
//		
//		// comment =>> select then ctrl + /
		
		
//		"Conditional Statements"
//		//>,<,>=,<=,==,!= conditional operators
		
//		&& and, || or, ! not    <logical operators>
		
//		! condition in bracket and ! before the bracket, see down
//		int age = 18;
//		
//		if (!(age >= 18)) {
//			System.out.println("You can vote");
//		}else {
//			System.out.println("You cannot vote");
//		}
		
//		boolean isEqual = 18==18;
//		System.out.println(19<=18);
//		System.out.println("Enter the temperature outside:");
//		int temp = sc.nextInt();
//		if (temp>=40) {
//			System.out.println("Bhai garmi boht badh gyi hai! bahr mt ja");
//		} else if (temp>30 && temp<40) {
//			System.out.println("Outside temp is ok, bahr ja skte hai");
//		}else if (temp>20 && temp<30) {
//			System.out.println("bhyi jeher mosam hai, ekdum cool. chal ride pe nikal");
//		}else {
//			System.out.println("bhai kadake ki thand pad rhi hai! bahar mat nikal.");
//		}
//		
//		"SWITCH CASE" its way more efficient than if else...it goes directly to the case instead of line by line
//		not efficient with range of integers
//		switch (temp) {
//		case 31:
//		case 32:
//		.
//		.
//		
//		
//		case 40 :
//			System.out.println("Bhai garmi boht badh gyi hai! bahr mt ja");
//			break;
//		case temp>30 && temp<40:
//		
//		default:
//			break;
//		System.out.println("Enter Grade");
//		
//		//??DOUBT, Isn't starting from this line
//		
//		char grade = sc.next().charAt(0); //IMP!!!!! input char
//		switch (grade) {
//		case 'A':
//			System.out.println("Outstanding JOB!");
//			break;
//		case 'B':
//			System.out.println("Not bad tho..");
//			break;
//		case 'C':
//			System.out.println("You can improve");
//			break;
//		case 'D':
//			System.out.println("Leave everything and head to study");
//			break;
//		default:
//			System.out.println("Invalid input");
//		}
		
//		"LOOPS"
//		for, while, do-while
		
//		#### for(initialise;end condition;execute at the end of every iteration)
//		String x = "MadhavBudhiraja";
//		for(int i = 0; i < x.length(); i++ ) {
//			System.out.println("madhav");
			
//		}
	
		int a = 15;
		int b = 8;
		
		int c = (a>b)? a : b;
		System.out.println(c);
		
	}		
	

}
