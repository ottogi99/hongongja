package sec02;

public class ImplementationC implements InterfaceA, InterfaceB, InterfaceC {

	@Override
	public void methodC() {
		System.out.println("ImplemetationC-methodC() ����");
	}

	@Override
	public void methodB() {
		System.out.println("ImplemetationC-methodB() ����");
	}

	@Override
	public void methodA() {
		System.out.println("ImplemetationC-methodA() ����");
	}

}
