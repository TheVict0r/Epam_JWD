package by.epamtc.task1.ex4.logic;

public class EvenNumbersLogic {

	public static boolean isTwoEvens(int[] numbersArr) {

		int evenCount = 0;

		boolean result = false;

		for (int i : numbersArr) {
			if (i % 2 == 0) {
				evenCount++;
			}
		}

		result = (evenCount >= 2);

		return result;
	}

}
