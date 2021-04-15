package by.epamtc.task1.ex2.main;

import by.epamtc.task1.ex2.datarequest.DataRequest;
import by.epamtc.task1.ex2.logic.YearAndMonthLogic;
import by.epamtc.task1.ex2.printer.Printer;

/* 
 * Составить программу, которая по заданным году и номеру месяца 
 * определяет количество дней в этом месяце и корректно определялись все високосные года.
 */

public class Main {
	public static void main(String[] args) {

		int year;
		year = DataRequest.enterYear();

		int month;
		month = DataRequest.enterMonth();

		int days;
		
		
		days = YearAndMonthLogic.defineDaysInMonth(month, year);
		Printer.printResult(days);
		
		

	}

}
