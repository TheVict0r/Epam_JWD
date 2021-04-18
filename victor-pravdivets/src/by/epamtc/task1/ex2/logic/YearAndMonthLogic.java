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
		
		/*
		 * Википедия:
		 * Чтобы средний календарный год лучше соответствовал солнечному, 
		 * было решено изменить правило високосных годов. 
		 * По-прежнему високосным оставался год, номер которого кратен четырём, 
		 * но исключение делалось для тех, которые были кратны 100. 
		 * Такие годы были високосными только тогда, когда делились ещё и на 400.
		 * Отсюда следует распределение високосных годов:
		 * - год, номер которого кратен 400, — високосный;
		 * - остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
		 * - остальные годы, номер которых кратен 4, — високосные.
		 * ======================
		 * исходя из этого придумать какие-то другие имена кроме как
		 * "делится на 4", "делится на 100" и "делится на 400" у меня пока не получается
		 */
		
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
		
		if( year <= 0) {
			//throw new ImpossibleYearException(year);
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
