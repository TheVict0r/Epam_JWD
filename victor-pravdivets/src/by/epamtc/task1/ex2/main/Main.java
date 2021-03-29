package by.epamtc.task1.ex2.main;

import by.epamtc.task1.ex2.datarequest.DataRequest;
import by.epamtc.task1.ex2.logic.YearAndMonthLogic;
import by.epamtc.task1.ex2.printer.Printer;

public class Main {
	public static void main(String[] args) {

		int year;
		year = DataRequest.yearRequest();

		int month;
		month = DataRequest.monthRequest();

		int days;
		days = YearAndMonthLogic.recieveDaysInMonth(month, year);

		Printer.printResult(days);

	}

}
