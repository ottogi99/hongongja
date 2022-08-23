package sec01;

public class Button {
	OnClickListener listener;
	
	void setOnClickListner(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// 중첩 인터페이스
	static interface OnClickListener {
		void onClick();
	}
}
