package kimdaeheon_assignment;

public class Bronze_Member extends Member{
	public Bronze_Member(String clientName, String contact, int purchaseNum) {
		super(clientName, contact, purchaseNum); // MemberŬ���� �����ڿ� ���� ����
	}
	
	@Override
	public double calcSales() {
		return 1000 * purchaseNum; // 1000 * ����
	}
}
