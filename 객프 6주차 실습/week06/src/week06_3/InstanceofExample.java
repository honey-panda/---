package week06_3;

public class InstanceofExample {
	public static void method1(Parent p) {
		// Child type���� ��ȯ�� �������� Ȯ��
		if(p instanceof Child) {
			// ���� �� ��ȯ�� �̷����
			Child c = (Child) p;
			System.out.println("method1 - child�� ��ȯ ����");
		}else {
			System.out.println("method2 - child�� ��ȯ ����");
		}
	}
	
	public static void method2(Parent p) {
		// ��ȯ�� �������� Ȯ���ϴ� ����� �����Ƿ� ������ �߻��� ��  ����
		Child c = (Child) p;
		System.out.println("method2 - child�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		// �ڵ� �� ��ȯ�� �̷����
		Parent parentA = new Child();
		
		// Child ��ü�� parameter�� ����
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		// Parent ��ü�� parameter�� ����
		method1(parentB);
		method2(parentB); // �����߻�
	}
}
