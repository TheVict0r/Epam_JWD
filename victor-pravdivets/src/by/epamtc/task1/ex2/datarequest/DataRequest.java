package by.epamtc.task1.ex2.datarequest;

import by.epamtc.task1.scanner.DataScanner;

public class DataRequest {
	
	public static int enterYear() {
		int year;
		System.out.println("Пожалуйста, введите год: ");

		do {
			year = DataScanner.enterIntFromConsole();

			if (year <= 0) {
				System.out.println("Год должен быть больше, чем 0. Попробуйте ввести ещё раз:");
			}

		} while (year <= 0);

		return year;
	}

	
	public static int enterMonth() {
		int month;
		System.out.println("Введите месяц:");
		
		do {
			month = DataScanner.enterIntFromConsole();
			
			if(month < 1 || month > 12) {
				System.out.println("Номер месяца должен находиться в диапазоне от 1 до 12. Введите ещё раз:");
			} 
		}while (month < 1 || month > 12);
		
		return month;
	}
	
}
