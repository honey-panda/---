package week06_2;
import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[] args) {
		// Shape type의 배열 생성
		ArrayList<Shape> array = new ArrayList<>();
		
		// 자동 형 변환에 의해
		// Shape type으로 변수를 선언했지만
		// 각 도형들을 참조해도 문제가 되지 않는다.
		Shape s1 = new Rectangle();
		Shape s2 = new Triangle();
		Shape s3 = new Circle();
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		//array.add(new Rectangle())
		//array.add(new Triangle())
		//array.add(new Circle())
		
		// 동적 바인딩이 일어나
		// 각 도형객체에서 override한 메소드가 호출된다.
		for(Shape i : array) {
			i.draw();
		}
	}
}
