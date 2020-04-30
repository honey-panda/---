package kimdaeheon_assignment;

public class SkinnableRobotPet extends RobotPet implements Skinnable{

	private int skin; // private skin
	
	// SkinnableRobotPet constructor
	public SkinnableRobotPet(String name, String masterName, int skin) {
		super(name, masterName);
		this.skin = skin;
	}
	
	@Override
	public String getName() {
		return super.getName(); // name getter
	}
	
	@Override
	public void setName(String name) {
		super.setName(name); // name setter
	}
	
	@Override
	public String getMasterName() {
		return super.getMasterName(); // masterName getter
	}
	
	@Override
	public void setMasterName(String masterName) {
		super.setMasterName(masterName); // masterName setter
	}
	
	public int getSkin() {
		return skin; // skin getter
	}
	
	public void setSkin(int skin) {
		this.skin = skin; // skin setter
	}
	
	// changeSkin
	@Override
	public void changeSkin(int skin) {
		if(skin >= 0 && skin <= 4) { // skin�� 0~4 ������ ���� ���
			this.setSkin(skin); // setter�� ���� skin �� ����
		}
		else { // �׿��� ���
			System.out.println("skin ���� 0~4�� �����մϴ�.");
		}
	}
	
	// printSkin
	@Override
	public void printSkin() {
		String Color = null; // ���ڷ� �� skin�� �ѱ۷� ��ȯ�ϱ� ���� ����
		switch(this.getSkin()) {
		case 0:
			Color = "����";
			break;
		case 1:
			Color = "�Ķ�";
			break;
		case 2:
			Color = "�ʷ�";
			break;
		case 3:
			Color = "����";
			break;
		case 4:
			Color = "���";
			break;
		}
		System.out.println("��Ų ����  " + Color + "�Դϴ�.");
	}
}
