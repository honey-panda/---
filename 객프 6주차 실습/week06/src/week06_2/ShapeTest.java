package week06_2;
import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[] args) {
		// Shape type�� �迭 ����
		ArrayList<Shape> array = new ArrayList<>();
		
		// �ڵ� �� ��ȯ�� ����
		// Shape type���� ������ ����������
		// �� �������� �����ص� ������ ���� �ʴ´�.
		Shape s1 = new Rectangle();
		Shape s2 = new Triangle();
		Shape s3 = new Circle();
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		//array.add(new Rectangle())
		//array.add(new Triangle())
		//array.add(new Circle())
		
		// ���� ���ε��� �Ͼ
		// �� ������ü���� override�� �޼ҵ尡 ȣ��ȴ�.
		for(Shape i : array) {
			i.draw();
		}
	}
}
