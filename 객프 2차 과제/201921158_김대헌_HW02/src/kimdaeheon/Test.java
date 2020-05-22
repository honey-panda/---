package kimdaeheon;

import java.util.Scanner;

public class Test {
	static Scanner input = null; // input Scanner �ʱ�ȭ
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
		
		System.out.println("employee1�� CompensationModel�� �����մϴ�.");
		System.out.println("1 : CCM, 2 : BPCCM");
		
		switch(input.nextInt()) { // employee1�� model ����
		case 1:
			employee1.setCompensationModel(new CommissionCompensationModel(10000, 0.06));
			System.out.printf("����� employee1�� earnings : %.2f\n", employee1.getCompensationModel().earnings());
			break;
		case 2:
			System.out.println("model1�� baseSalary�� �����մϴ�.");
			employee1.setCompensationModel(new BasePlusCommissionCompensationModel(10000, 0.06, input.nextDouble()));
			System.out.printf("����� employee1�� earnings : %.2f\n", employee1.getCompensationModel().earnings());
			break;
		default: 
			System.out.println("���� 1, 2�� �Է��� ��  �ֽ��ϴ�.");
			break;
		}
		
		System.out.println("employee2�� CompensationModel�� �����մϴ�.");
		System.out.println("1 : CCM, 2 : BPCCM");
		
		switch(input.nextInt()) { // employee2�� model ����
		case 1:
			employee2.setCompensationModel(new CommissionCompensationModel(5000, 0.04));
			System.out.printf("����� employee2�� earnings : %.2f\n", employee2.getCompensationModel().earnings());
			break;
		case 2:
			System.out.println("model2�� baseSalary�� �����մϴ�.");
			employee2.setCompensationModel(new BasePlusCommissionCompensationModel(5000, 0.04, input.nextDouble()));
			System.out.printf("����� employee2�� earnings : %.2f\n", employee2.getCompensationModel().earnings());
			break;
		default:
			System.out.println("���� 1, 2�� �Է��� ��  �ֽ��ϴ�.");
			break;
		}
		
	}
}
