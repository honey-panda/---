package week07_3;

public class VR_Player implements ExPlayer, Wearable{
	
	@Override
	public void play() {
		System.out.println("������ ����մϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}
	
	@Override
	public void slow() {
		System.out.println("������ ������ ����մϴ�.");
	}
	
	@Override
	public void putOn() {
		System.out.println("��⸦ �����մϴ�.");
	}
	
	@Override
	public void putOff() {
		System.out.println("��⸦ �����ϴ�.");
	}
}
