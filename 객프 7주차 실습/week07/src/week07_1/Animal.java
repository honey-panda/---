package week07_1;

public abstract class Animal {
	public String name;
	
	// �Ϲ� �޼ҵ� ����
	public void breathe() {
		System.out.println(name + "�� ���� ���ϴ�.");
	}
	
	// �߻� �޼ҵ� ����
	public abstract void sound();
}
