package kimdaeheon;

public class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private CompensationModel compensationModel;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber, 
			CompensationModel compensationModel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.compensationModel = compensationModel;
	}
	
	public String getFirstName() {
		return firstName; // firstName getter
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName; // firstName setter
	}
	
	public String getLastName() {
		return lastName; // lastName getter
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName; // lastName setter
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber; // socialSecurityNumber getter
	}
	
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber; // socialSecurityNumber setter
	}
	
	public CompensationModel getCompensationModel() {
		return compensationModel; // compensationModel getter;
	}
	
	public void setCompensationModel(CompensationModel compensationModel) {
		this.compensationModel = compensationModel; // compensationModel setter;
	}
	
	public double earnings() { // compensationModel¿« earning »£√‚
		return this.getCompensationModel().earnings();
	}
}
