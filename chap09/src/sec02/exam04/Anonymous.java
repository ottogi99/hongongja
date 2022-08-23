package sec02.exam04;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		// 익명 객체에서 사용하는 매개 변수나 로컬 변수의 값을 익명 객체 내부에 복사해두고 사용합니다.
		// 매개 변수나 로컬 변수가 수정되어 값이 변경되면 익명 객체에 복사해 둔 값과 달라지므로 매개변수나 로컬 변수를 final로 선언할 것을 요구합니다.
		// 자바8부터는 final 선언을 하지 않아도 값이 수정될 수 없도록 final 특성을 부여합니다.
		
		// 에러 발생
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
