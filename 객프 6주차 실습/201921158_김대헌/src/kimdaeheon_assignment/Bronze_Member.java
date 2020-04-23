package kimdaeheon_assignment;

public class Bronze_Member extends Member{
	public Bronze_Member(String clientName, String contact, int purchaseNum) {
		super(clientName, contact, purchaseNum); // Member클래스 생성자에 인자 전달
	}
	
	@Override
	public double calcSales() {
		return 1000 * purchaseNum; // 1000 * 개수
	}
}
