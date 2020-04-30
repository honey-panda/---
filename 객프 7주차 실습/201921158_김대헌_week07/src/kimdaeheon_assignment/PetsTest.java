package kimdaeheon_assignment;
import java.util.ArrayList;

public class PetsTest {
	public static void main(String[] args) { // 메인 메소드
		ArrayList<Pet> myPet = new ArrayList<Pet>(); // Pet 배열 선언
		myPet.add(new Pet("동근이", "장근"));
		myPet.add(new RobotPet("동현이", "우현"));
		myPet.add(new SkinnableRobotPet("상범이", "효범", Skinnable.GREEN));
		
		for(int i = 0; i < 3; i++) {
			for(Pet pet : myPet) {
				pet.introduce(); // 인사
				if(pet instanceof RobotPet) {
					((RobotPet) pet).work((int)(Math.random() * 3 + 1)); // 1~3 사이의 랜덤변수
				}
				if(pet instanceof SkinnableRobotPet) {
					((SkinnableRobotPet) pet).printSkin(); // skin 출력
					((SkinnableRobotPet) pet).setSkin((int)(Math.random() * 5)); // 0~5 사이의 랜덤변수
				}
			} // for(pet) loop end
			System.out.println();
		} // for(i) loop end
	}
}
