package sec02.exam04;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		// �͸� ��ü���� ����ϴ� �Ű� ������ ���� ������ ���� �͸� ��ü ���ο� �����صΰ� ����մϴ�.
		// �Ű� ������ ���� ������ �����Ǿ� ���� ����Ǹ� �͸� ��ü�� ������ �� ���� �޶����Ƿ� �Ű������� ���� ������ final�� ������ ���� �䱸�մϴ�.
		// �ڹ�8���ʹ� final ������ ���� �ʾƵ� ���� ������ �� ������ final Ư���� �ο��մϴ�.
		
		// ���� �߻�
		//arg1 = 20;
		//arg2 = 20;
		
		//var1 = 30;
		//var2 = 30;
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
			
		System.out.println(calc.sum());
	}
}
