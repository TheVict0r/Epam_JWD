package by.epamtc.task1.ex6.datarequest;

import by.epamtc.task1.scanner.DataScanner;

public class DataRequest {
	
	public static final int SECONS_IN_DAY = 86_400;
	
	public static int requestSeconds() {
		int secondsBeforeN;
		
		System.out.println("Пожалуйста, укажите ту секунду суток, до которой необходимо посчитать полные часы, минуты и секунды.");
		
		do {
			secondsBeforeN = DataScanner.enterIntFromConsole() - 1;

			if (secondsBeforeN == 0) {
				System.out.println("Секунда не может быть нулевой. Введите данные ещё раз:");
			} else if (secondsBeforeN < 0) {
				System.out.println("Секунда не может быть отрицательной. Введите данные ещё раз:");
			} else if (secondsBeforeN > SECONS_IN_DAY) {
				System.out.println("Вы ввели большее количество секунд, чем содержится в сутках. Введите данные ещё раз:");
			}
			
		} while (secondsBeforeN < 1 || secondsBeforeN > SECONS_IN_DAY);

		return secondsBeforeN;
	}

}
