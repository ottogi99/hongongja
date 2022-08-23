package sec01;

// ��ü �ؽ��ڵ�(hashCode())
// hashCode() �޼ҵ�� ��ü�� �޸� ������ �̿��ؼ� �ؽ��ڵ带 ����� �����ϱ� ������ ��ü���� �ٸ� ���� ������ �ֽ��ϴ�.


// hasCode() �޼ҵ带 ���������� ����.
public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	// �ǵ��� ��� "ȫ�浿"�� �������� �������� hashCode() �޼ҵ带 Key Ŭ������ �߰��մϴ�.
	// HashSet, HashMap, Hashtable ���� ����񱳽� hashCode ������ �ʿ�
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
