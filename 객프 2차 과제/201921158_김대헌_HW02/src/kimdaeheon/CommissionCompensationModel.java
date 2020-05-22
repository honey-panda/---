package kimdaeheon;

public class CommissionCompensationModel extends CompensationModel{

	private double grossSales;
	private double commissionRate;
	
	public CommissionCompensationModel(double grossSales, double commissionRate) {
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
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
		return this.getGrossSales() * this.getCommissionRate();
	}
}
