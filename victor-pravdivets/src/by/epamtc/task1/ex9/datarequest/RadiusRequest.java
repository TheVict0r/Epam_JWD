package by.epamtc.task1.ex9.datarequest;

import by.epamtc.task1.scanner.DataScanner;

public class RadiusRequest {

	public static int requestRadius () {
		int r;
		
		System.out.println("Введите значение радиуса R:");
		
		do {
			r = DataScanner.enterIntFromConsole();
			
			if(r <= 0) {
				System.out.println("Значение радиуса должно быть больше 0. \nПопробуйте ввести ещё раз:");
			}
			
		} while (r <= 0);
		
		
		return r;
	}
	
	
}
