package sec02;

public class ImplementationC implements InterfaceA, InterfaceB, InterfaceC {

	@Override
	public void methodC() {
		System.out.println("ImplemetationC-methodC() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplemetationC-methodB() 실행");
	}

	@Override
	public void methodA() {
		System.out.println("ImplemetationC-methodA() 실행");
	}

}
