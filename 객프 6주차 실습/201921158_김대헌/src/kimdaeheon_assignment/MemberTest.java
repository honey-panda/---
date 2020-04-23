package kimdaeheon_assignment;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class MemberTest {
	static Scanner input = null; // input Scanner 초기화
	
	public static void main(String args[]) { // main 메소드
		input = new Scanner(System.in); // input
		ArrayList<Member> myMembers = new ArrayList<>(); // MemberList 생성
		
		programStart(myMembers);
	}
	
	// 전체 탭
	public static void programStart(ArrayList<Member> myMembers) {
		boolean flag = true;
		while(flag) {
			System.out.println("1. Bronze 등급 고객 등록");
			System.out.println("2. Silver 등급 고객 등록");
			System.out.println("3. Gold 등급 고객 등록");
			System.out.println("4. 총 매출액 정산");
			System.out.println("5. 종료");
			
			int choice;
			
			try { // 입력을 받고
				choice = input.nextInt();
			} catch(InputMismatchException e) {
				// 숫자가 아니라면
				System.out.println("숫자만 입력할 수 있습니다.");
				input.nextLine(); // buffer 비우기
				continue;
			}
			switch(choice) {
			case 1:
				myMembers.add(registClient(choice)); // Bronze 등록
				break;
			case 2:
				myMembers.add(registClient(choice)); // Silver 등록
				break;
			case 3: 
				myMembers.add(registClient(choice)); // Gold 등록
				break;
			case 4:
				System.out.printf("총 매출은 %.1f원 입니다.\n", adjustment(myMembers));
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			default:
				System.out.println("1~5의 숫자만 입력할 수 있습니다.");
				break;
			}
		}
	}
	// registClient
	public static Member registClient(int choice) {
		System.out.println("고객 이름을 입력하세요");
		String clientName = input.next();
		System.out.println("고객 연락처를 입력하세요");
		String contact = input.next();
		System.out.println("구매 개수를 입력하세요");
		int purchaseNum = input.nextInt();
		System.out.println("입력되었습니다.");
		
		switch(choice) {
		case 1:
			return new Bronze_Member(clientName, contact, purchaseNum); // bronze client
		case 2:
			return new Silver_Member(clientName, contact, purchaseNum, 0.9); // Silver client
		case 3:
			return new Gold_Member(clientName, contact, purchaseNum, 0.5); // Gold client
		default:
			return null; 
		}
	}
	// adjustment
	public static double adjustment(ArrayList<Member> myMembers) {
		double totalTouch = 0; // 총 매출액 초기화
		for(Member i : myMembers) {
			totalTouch += i.calcSales();
		}
		return totalTouch;
	}
	
}


