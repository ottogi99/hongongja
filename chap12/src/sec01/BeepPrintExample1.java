package sec01;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
//
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
//		thread.start();

		// �͸� ���� ��ü�� ����
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch (Exception e) {}
				}
			}
		});
		thread.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}

}
