package kimdaeheon2_2;

public class CommissionEmployee extends Employee{
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	
	// constructor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
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
		return getCommissionRate() * getGrossSales();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%, .2f; %s: %.2f", "commission employee", 
				super.toString(), "gross sales", getGrossSales(), "commission rate", getCommissionRate());
	}
}
