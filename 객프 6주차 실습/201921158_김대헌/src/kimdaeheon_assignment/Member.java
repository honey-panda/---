package kimdaeheon_assignment;

public class Member {
	protected String clientName; // 고객의 이름
	protected String contact; // 고객의 연락처 
	protected int purchaseNum; // 고객의 구매 개수
	
	public Member(String clientName, String contact, int purchaseNum) {
		this.clientName = clientName; // clientName 초기화
		this.contact = contact; // contact 초기화
		this.purchaseNum = purchaseNum; // purchaseNum 초기화
	}
	
	public String getClientName() {
		return clientName; // clientName getter
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName; // clientName setter
	}
	
	public String getContact() {
		return contact; // contact getter
	}
	
	public void setContact(String contact) {
		this.contact = contact; // contact setter
	}
	
	public int getPurchaseNum() {
		return purchaseNum; // purchaseNum getter
	}
	
	public void setPurchaseNum(int purchaseNum) {
		this.purchaseNum = purchaseNum; // purchaseNum setter
	}
	
	public double calcSales() {
		System.out.println("등급이 정해지지 않았습니다.");
		return 0;
	}
}
