package week07_2;

public interface Radar {
	// ��� �ʵ�, �ʱⰪ�� �ݵ�� �����ؾ��Ѵ�.
	public static final double ANTENNAGAIN = 13.4;
	// public static final Ű���� ���� ����
	double RANGE = 100.5;
	
	// �߻�޼ҵ�, �޼ҵ� ����θ� �ۼ��Ѵ�.
	public abstract void turnOn();
	// public abstract Ű���� ��������
	void turnON();
	
	// ����Ʈ �޼ҵ�, �޼ҵ� ������ �ۼ��� �� �ִ�. ��, �������̽��� ������ ��ü���� ȣ���ؾ� �Ѵ�.
	public default void Radiate(double Power) {
		System.out.println(Power + ANTENNAGAIN + "dB ��ȣ�� ���濡 ����մϴ�.");
	}
	
	// ���� �޼ҵ�, ��ü�������� ȣ���� �� �ִ�.
	public static void Recieve() {
		System.out.println(RANGE + "km ���� ���� ��ȣ�� �����մϴ�.");
	}
}
