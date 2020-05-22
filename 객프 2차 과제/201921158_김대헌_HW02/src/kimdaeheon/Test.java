package kimdaeheon;

import java.util.Scanner;

public class Test {
	static Scanner input = null; // input Scanner 초기화
	public static void main(String args[]) {
		input = new Scanner(System.in); // input
		
		CommissionCompensationModel model1 = new CommissionCompensationModel(10000, 0.06);
		BasePlusCommissionCompensationModel model2 = new BasePlusCommissionCompensationModel(5000, 0.04, 300);
		
		Employee employee1 = new Employee(
				"Sue", "Jones", "222-22-2222", model1);
		
		Employee employee2 = new Employee(
				"Bob", "Lewis", "333-33-3333", model2);
		
		System.out.println(employee1.getCompensationModel().earnings());
		System.out.println(employee2.getCompensationModel().earnings());
		
		System.out.println("employee1의 CompensationModel을 변경합니다.");
		System.out.println("1 : CCM, 2 : BPCCM");
		
		switch(input.nextInt()) { // employee1의 model 변경
		case 1:
			employee1.setCompensationModel(new CommissionCompensationModel(10000, 0.06));
			System.out.printf("변경된 employee1의 earnings : %.2f\n", employee1.getCompensationModel().earnings());
			break;
		case 2:
			System.out.println("model1의 baseSalary를 설정합니다.");
			employee1.setCompensationModel(new BasePlusCommissionCompensationModel(10000, 0.06, input.nextDouble()));
			System.out.printf("변경된 employee1의 earnings : %.2f\n", employee1.getCompensationModel().earnings());
			break;
		default: 
			System.out.println("숫자 1, 2만 입력할 수  있습니다.");
			break;
		}
		
		System.out.println("employee2의 CompensationModel을 변경합니다.");
		System.out.println("1 : CCM, 2 : BPCCM");
		
		switch(input.nextInt()) { // employee2의 model 변경
		case 1:
			employee2.setCompensationModel(new CommissionCompensationModel(5000, 0.04));
			System.out.printf("변경된 employee2의 earnings : %.2f\n", employee2.getCompensationModel().earnings());
			break;
		case 2:
			System.out.println("model2의 baseSalary를 설정합니다.");
			employee2.setCompensationModel(new BasePlusCommissionCompensationModel(5000, 0.04, input.nextDouble()));
			System.out.printf("변경된 employee2의 earnings : %.2f\n", employee2.getCompensationModel().earnings());
			break;
		default:
			System.out.println("숫자 1, 2만 입력할 수  있습니다.");
			break;
		}
		
	}
}
