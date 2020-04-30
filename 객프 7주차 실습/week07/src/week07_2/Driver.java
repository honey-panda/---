package week07_2;

public class Driver {
	
	// 매개변수 타입 = 인터페이스
	// 따라서 어떠한 구현 객체가 넘어오는지에 따라 실현내용 바뀜
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
