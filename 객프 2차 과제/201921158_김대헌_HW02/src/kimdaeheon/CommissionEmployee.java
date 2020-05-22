package kimdaeheon;

public class CommissionEmployee extends Employee{
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
			CompensationModel compensationModel, double grossSales,
			double commissionRate) {
		
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
