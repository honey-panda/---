package week07_1;
import java.util.ArrayList;

public class AnimalExample {
	public static void main(String[] args) {
		// Animal type을 저장할 수 있는 배열 생성
		ArrayList<Animal> array = new ArrayList<>();
		
		// 자동 형 변환에 의해 자식 타입을 부모타입 배열에 저장
		array.add(new Dog("동근이"));
		array.add(new Cat("장근이"));
		
		for (Animal i : array) {
			i.breathe();
		}
		
		// overriding된 메소드 호출
		for (Animal i : array) {
			i.sound();
		}
	}
}
