package sec01;

public class Button {
	OnClickListener listener;
	
	void setOnClickListner(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// ��ø �������̽�
	static interface OnClickListener {
		void onClick();
	}
}
