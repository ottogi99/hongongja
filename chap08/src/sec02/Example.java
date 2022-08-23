package sec02;

public class Example {

	public static void main(String[] args) {
		ImplementationC imple = new ImplementationC();
		
		InterfaceA ia = imple;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = imple;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = imple;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
