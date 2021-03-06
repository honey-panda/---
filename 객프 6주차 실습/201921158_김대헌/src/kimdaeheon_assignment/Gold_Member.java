package kimdaeheon_assignment;

public class Gold_Member extends Member {
	private double discountRate; // 할인율
	
	public Gold_Member(String clientName, String contact, int purchaseNum, double discountRate) {
		super(clientName, contact, purchaseNum); // Member클래스 생성자에 인자 전달
		this.discountRate = discountRate; // Gold의 할인율
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