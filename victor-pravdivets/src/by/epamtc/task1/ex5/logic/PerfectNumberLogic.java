package by.epamtc.task1.ex5.logic;

public class PerfectNumberLogic {
	public static boolean isPerfectNumber(int num) {
		if(num <= 0) { //проверка на натуральное число
			return false;
		}
		
		
		int dividersSum = 0;

		boolean result = false;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				dividersSum += i;
			}
		}

		result = (dividersSum == num);

		return result;
	}

}
