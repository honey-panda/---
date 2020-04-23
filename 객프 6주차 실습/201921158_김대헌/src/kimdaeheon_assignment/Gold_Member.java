package kimdaeheon_assignment;

public class Gold_Member extends Member {
	private double discountRate; // ������
	
	public Gold_Member(String clientName, String contact, int purchaseNum, double discountRate) {
		super(clientName, contact, purchaseNum); // MemberŬ���� �����ڿ� ���� ����
		this.discountRate = discountRate; // Gold�� ������
	}
	
	public double getDiscountRate() {
		return discountRate; // discountRate getter
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate; // discountRate setter
	}
	
	@Override
	public double calcSales() {
		return 1000 * purchaseNum * discountRate;
	}
}