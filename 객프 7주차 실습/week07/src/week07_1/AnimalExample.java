package week07_1;
import java.util.ArrayList;

public class AnimalExample {
	public static void main(String[] args) {
		// Animal type�� ������ �� �ִ� �迭 ����
		ArrayList<Animal> array = new ArrayList<>();
		
		// �ڵ� �� ��ȯ�� ���� �ڽ� Ÿ���� �θ�Ÿ�� �迭�� ����
		array.add(new Dog("������"));
		array.add(new Cat("�����"));
		
		for (Animal i : array) {
			i.breathe();
		}
		
		// overriding�� �޼ҵ� ȣ��
		for (Animal i : array) {
			i.sound();
		}
	}
}
