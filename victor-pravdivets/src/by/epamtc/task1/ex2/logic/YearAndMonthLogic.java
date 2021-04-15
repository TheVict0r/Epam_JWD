package by.epamtc.task1.ex2.logic;

public class YearAndMonthLogic {
	
	public static boolean isLeapYear(int year) {
		
		if( year <= 0) {
			//throw new ImpossibleYearException(year);
			//пока не реализовано
		}
		
		boolean result = false;

		boolean isDividedBy4 = (year % 4 == 0);
		boolean isDividedBy100 = (year % 100 == 0);
		boolean isDividedBy400 = (year % 400 == 0);

		boolean leapYearOption1 = isDividedBy4 && !isDividedBy100;
		boolean leapYearOption2 = isDividedBy4 && isDividedBy100 && isDividedBy400;
		
		if (leapYearOption1 || leapYearOption2) {
			result = true;
		}
		
		return result;
	}

	
	public static int defineDaysInMonth (int month, int year) {
		if (month <= 0 || month > 12) {
			//throw new ImpossibleMonthException(month);
			//пока не реализовано
		}
		
		int days = 0;
		
		if (month == 2 && isLeapYear(year)) {
			days = 29;
		} else if (month == 2 && !isLeapYear(year)) {
			days = 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else {
			days = 31;
		}

		return days;
	}
	
	
}
