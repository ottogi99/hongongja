package sec01;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// �ĺ�Ű new Key(1)�� "ȫ�浿"�� ������.
		hashMap.put(new Key(1), "ȫ�浿");
		
		// �ĺ�Ű new Key(1)�� "ȫ�浿"�� �о��.
		String value = hashMap.get(new Key(1));
		
		// HashMap�� number �ʵ尪�� ������ hashCode() �޼ҵ忡�� �����ϴ� �ؽ��ڵ尡 �ٸ��Ƿ� �ٸ� �ĺ�Ű�� �ν��մϴ�.
		// �׷��� null�� ���ɴϴ�.
		System.out.println(value);

	}

}
