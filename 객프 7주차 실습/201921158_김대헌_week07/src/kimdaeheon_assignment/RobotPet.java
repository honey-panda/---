package kimdaeheon_assignment;

public class RobotPet extends Pet{
	
	// RobotPet constructor
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	// introduce
	@Override
	public void introduce() {
		System.out.println("** ���� �κ�! �̸��� " + super.getName() + " �Դϴ�.");
		System.out.println("** ���δ��� �̸��� " + super.getMasterName() + " �Դϴ�.");
	}
	
	// work
	public void work(int choice) {
		switch(choice) {
		case 1:
			System.out.println("û�Ҹ� �մϴ�.");
			break;
		case 2:
			System.out.println("��Ź�� �մϴ�.");
			break;
		case 3:
			System.out.println("���� ���ϴ�.");
			break;
		}
	}
}
