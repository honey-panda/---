package kimdaeheon_assignment;
import java.util.ArrayList;

public class PetsTest {
	public static void main(String[] args) { // ���� �޼ҵ�
		ArrayList<Pet> myPet = new ArrayList<Pet>(); // Pet �迭 ����
		myPet.add(new Pet("������", "���"));
		myPet.add(new RobotPet("������", "����"));
		myPet.add(new SkinnableRobotPet("�����", "ȿ��", Skinnable.GREEN));
		
		for(int i = 0; i < 3; i++) {
			for(Pet pet : myPet) {
				pet.introduce(); // �λ�
				if(pet instanceof RobotPet) {
					((RobotPet) pet).work((int)(Math.random() * 3 + 1)); // 1~3 ������ ��������
				}
				if(pet instanceof SkinnableRobotPet) {
					((SkinnableRobotPet) pet).printSkin(); // skin ���
					((SkinnableRobotPet) pet).setSkin((int)(Math.random() * 5)); // 0~5 ������ ��������
				}
			} // for(pet) loop end
			System.out.println();
		} // for(i) loop end
	}
}
