package week07_2;

public interface Radar {
	// 상수 필드, 초기값을 반드시 대입해야한다.
	public static final double ANTENNAGAIN = 13.4;
	// public static final 키워드 생략 가능
	double RANGE = 100.5;
	
	// 추상메소드, 메소드 선언부만 작성한다.
	public abstract void turnOn();
	// public abstract 키워드 생략가능
	void turnON();
	
	// 디폴트 메소드, 메소드 내용을 작성할 수 있다. 단, 인터페이스를 구현한 객체에서 호출해야 한다.
	public default void Radiate(double Power) {
		System.out.println(Power + ANTENNAGAIN + "dB 신호를 전방에 방사합니다.");
	}
	
	// 정적 메소드, 객체생성없이 호출할 수 있다.
	public static void Recieve() {
		System.out.println(RANGE + "km 범위 내의 신호를 수신합니다.");
	}
}
