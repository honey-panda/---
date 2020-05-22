package kimdaeheon2_2;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary; // base salary per week
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("Basesalary must be > 0.0");
		}
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary() {
		return this.baseSalary; // baseSalary getter
	}
	
	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary; // baseSalary setter
	}
	
	@Override
	public double earnings() {
		return this.getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s: %s: $%,.2f", "base_salaried", 
				super.toString(), "base salary", getBaseSalary());
	}
}
