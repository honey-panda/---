package kimdaeheon_assignment;

public class RobotPet extends Pet{
	
	// RobotPet constructor
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	// introduce
	@Override
	public void introduce() {
		System.out.println("** 나는 로봇! 이름은 " + super.getName() + " 입니다.");
		System.out.println("** 주인님의 이름은 " + super.getMasterName() + " 입니다.");
	}
	
	// work
	public void work(int choice) {
		switch(choice) {
		case 1:
			System.out.println("청소를 합니다.");
			break;
		case 2:
			System.out.println("세탁을 합니다.");
			break;
		case 3:
			System.out.println("불을 끕니다.");
			break;
		}
	}
}
