package by.epamtc.task1.ex4.logic;

import by.epamtc.task1.scanner.DataScanner;

public class EvenNumbersLogic {
	public static int[] recieveFourIntegersFromConsole() {

		int[] numbersArr = new int[4];

		System.out.println("Введите четыре целых числа. \nВвод каждого числа подтверждайте клавишей <Enter>:");
		for (int i = 0; i < numbersArr.length; i++) {
			numbersArr[i] = DataScanner.enterIntFromConsole();
		}

		return numbersArr;
	}

	public static boolean checkNumbers(int[] numbersArr) {

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
