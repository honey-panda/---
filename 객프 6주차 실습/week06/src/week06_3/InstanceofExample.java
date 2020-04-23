package week06_3;

public class InstanceofExample {
	public static void method1(Parent p) {
		// Child type으로 변환이 가능한지 확인
		if(p instanceof Child) {
			// 강제 형 변환이 이루어짐
			Child c = (Child) p;
			System.out.println("method1 - child로 변환 성공");
		}else {
			System.out.println("method2 - child로 변환 실패");
		}
	}
	
	public static void method2(Parent p) {
		// 변환이 가능한지 확인하는 기능이 없으므로 에러가 발생할 수  있음
		Child c = (Child) p;
		System.out.println("method2 - child로 변환 성공");
	}
	
	public static void main(String[] args) {
		// 자동 형 변환이 이루어짐
		Parent parentA = new Child();
		
		// Child 객체를 parameter로 전달
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		// Parent 객체를 parameter로 전달
		method1(parentB);
		method2(parentB); // 에러발생
	}
}
