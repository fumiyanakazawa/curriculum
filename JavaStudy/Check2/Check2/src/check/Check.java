package check;

import constants.Constants;

public class Check {
	private static String firstName = "Nakazawa";
	private static String lastName = "Fumiya";

	private static void printName() {
		System.out.println(firstName + lastName);

	}

	public static void main(String[] args) {

		System.out.print("printNameメソッド → ");
		printName();

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();

	}
}
