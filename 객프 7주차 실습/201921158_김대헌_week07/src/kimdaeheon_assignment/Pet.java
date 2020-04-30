package kimdaeheon_assignment;

public class Pet {
	private String name;       // name
	private String masterName; // masterName
	
	// Pet constructor
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	public String getName() {
		return name; // name getter
	}
	
	public void setName(String name) {
		this.name = name; // name setter
	}
	
	public String getMasterName() {
		return masterName; // masterName getter
	}
	
	public void setMasterName(String masterName) {
		this.masterName = masterName; // masterName setter
	}
	
	public void introduce() {
		System.out.println("* �� �̸��� " + name + " �Դϴ�.");
		System.out.println("* ���δ��� �̸��� " + masterName + " �Դϴ�.");
	}
}
