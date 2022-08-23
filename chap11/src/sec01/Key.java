package sec01;

// 객체 해시코드(hashCode())
// hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴하기 때문에 객체마다 다른 값을 가지고 있습니다.


// hasCode() 메소드를 재정의하지 않음.
public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	// 의도한 대로 "홍길동"을 읽으려면 재정의한 hashCode() 메소드를 Key 클래스에 추가합니다.
	// HashSet, HashMap, Hashtable 에서 동등비교시 hashCode 재정의 필요
	@Override
	public int hashCode() {
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
}
