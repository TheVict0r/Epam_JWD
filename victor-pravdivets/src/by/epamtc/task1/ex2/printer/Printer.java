package by.epamtc.task1.ex2.printer;

import by.epamtc.task1.ex2.exception.TotalDaysMonthException;

public class Printer {
	
	public static void printResult(int days) throws TotalDaysMonthException {
		if (days < 28 || days > 31) {
			throw new TotalDaysMonthException();
		}
		
		String message;
		if (days == 31) {
			message = "В этом месяце 31 день.";
		} else {
			message = String.format("В этом месяце %s дней.", days);
		}
		
		System.out.println(message);
	}
	
	
}
