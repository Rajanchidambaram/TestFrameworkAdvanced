package oopsconcepts;

public class InheritAbs extends AbstractExample{
	static int a=5;
	@Override
	public void shape( ) {
		// TODO Auto-generated method stub
		System.out.println("Implemented abstract method");
		
	}


	public static void main(String args[]) {
		
	InheritAbs ih;
	
	new InheritAbs();
	new InheritAbs().method1().method2();
	
	}	


}
