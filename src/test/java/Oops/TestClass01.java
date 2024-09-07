package Oops;

import java.io.PrintStream;



public class TestClass01 extends Abstract01  implements Interface_01{

	@Override
	void sound() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
	
		TestClass01 tc=new TestClass01();
		tc.eat();
		System.out.println(Interface_01.name);
		System.out.println(Interface_01.salary);
		Interface_01.a();
		tc.s();
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

}
