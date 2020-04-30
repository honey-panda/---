package week07_2;

public class VehicleTest {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}
