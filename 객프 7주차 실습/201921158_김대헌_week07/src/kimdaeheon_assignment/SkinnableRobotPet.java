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
		if(skin >= 0 && skin <= 4) { // skin이 0~4 사이의 값일 경우
			this.setSkin(skin); // setter를 통해 skin 값 변경
		}
		else { // 그외의 경우
			System.out.println("skin 값은 0~4만 가능합니다.");
		}
	}
	
	// printSkin
	@Override
	public void printSkin() {
		String Color = null; // 숫자로 된 skin을 한글로 변환하기 위해 선언
		switch(this.getSkin()) {
		case 0:
			Color = "검정";
			break;
		case 1:
			Color = "파랑";
			break;
		case 2:
			Color = "초록";
			break;
		case 3:
			Color = "빨강";
			break;
		case 4:
			Color = "노랑";
			break;
		}
		System.out.println("스킨 색은  " + Color + "입니다.");
	}
}
