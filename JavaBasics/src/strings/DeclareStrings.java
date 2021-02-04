package strings;

public class DeclareStrings {
	public static void main(String[] args) {
		//Heap Area
		String mobile1 = new String("realme");
		//String Pool Area
		String mobile2 = "redmi";
		//Difference
		String mobile3 = new String("redmi");
		System.out.println(mobile2 == mobile3);
		
		// >>false return
		// bcoz mobile2 is created in str pool(literal) whereas mobile3 in heap(object)
		
		
	}
}
