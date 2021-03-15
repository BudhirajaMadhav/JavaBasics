package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {

	public static void main(String[] args) {
		A objA = new A();
		B objB = objA.new B();
		
		C objC = new C();
	}

}
