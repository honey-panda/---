package kimdaeheon;

public class BasePlusCommissionEmployee extends Employee{
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	private double baseSalary; // base salary per week
	BasePlusCommissionCompensationModel basePlusCommissionCompensationModel;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, BasePlusCommissionCompensationModel 
			compensationModel, double grossSales, double commissionRate,
			double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, compensationModel);
		
		// if grossSales is invalid throw exception
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
				
		// if commissionRate is invalid throw exception
		if(commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
				
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.basePlusCommissionCompensationModel = compensationModel;
		this.baseSalary = baseSalary;
	}
	
	public double getGrossSales() {
		return grossSales; // grossSales getter
	}
	
	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		this.grossSales = grossSales; // grossSales setter
	}
	
	public double getCommissionRate() {
		return commissionRate; // commissionRate getter
	}
	
	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		this.commissionRate = commissionRate; // commissionRate setter
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
		this.getCompensationModel().setCommissionRate(this.getCommissionRate());
		this.getCompensationModel().setGrossSales(this.getGrossSales());
		return this.getCompensationModel().earnings(); 
	}
	
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
				"commission employee", getFirstName(), getLastName(), "social security number",
				getSocialSecurityNumber(), "gross sales", getGrossSales(), "comission rate",
				getCommissionRate(), "earnings", earnings());
	}
}
