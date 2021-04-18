package by.epamtc.task1.ex4.logic;

public class EvenNumbersLogic {

	public static boolean isTwoEvens(int[] numbersArr) {

		if (numbersArr == null) {
			// throw new NullArrayException("Variable is not initialized");
			// пока не реализовано
		}

		int evenCount = 0;

		boolean result = false;

		for (int i : numbersArr) {
			if (i % 2 == 0) {
				evenCount++;
			}
			result = (evenCount >= 2);
			if (result) {
				break;
			}

		}

		return result;
	}

}
