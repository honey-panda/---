package kimdaeheon;

public class BasePlusCommissionCompensationModel extends CompensationModel{
	
	public double grossSales;
	public double commissionRate;
	public double baseSalary;
	
	public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		if(commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("Basesalary must be > 0.0");
		}
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
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
		return this.getBaseSalary() + this.getGrossSales() * this.getCommissionRate();
	}
}
