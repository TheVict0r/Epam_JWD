package by.epamtc.task1.ex6.logic;

import by.epamtc.task1.ex6.exception.WrongNumberOfSecondsException;

public class LogicHoursMinutesSeconds{
	
public static final int SECONDS_IN_MINUTE = 60;
public static final int MINUTES_IN_HOUR = 60;
public static final int SECONS_IN_DAY = 86_400;

	public static int calculateHours(int secondsBeforeN) throws WrongNumberOfSecondsException {
		
		if (secondsBeforeN < 0) {
			throw new WrongNumberOfSecondsException("Секунда не может быть отрицательной");
		} else if (secondsBeforeN == 0) {
			throw new WrongNumberOfSecondsException("Секунда не может быть нулевой");
		} else if (secondsBeforeN > SECONS_IN_DAY) {
			throw new WrongNumberOfSecondsException("Количество секунд превышает максимально возможное");
		}
		
		int hours;
		hours = secondsBeforeN / SECONDS_IN_MINUTE / MINUTES_IN_HOUR;
		return hours;
	}
	
	public static int calculateMinutes(int secondsBeforeN) throws WrongNumberOfSecondsException {
		
		if (secondsBeforeN < 0) {
			throw new WrongNumberOfSecondsException("Секунда не может быть отрицательной");
		} else if (secondsBeforeN == 0) {
			throw new WrongNumberOfSecondsException("Секунда не может быть нулевой");
		} else if (secondsBeforeN > SECONS_IN_DAY) {
			throw new WrongNumberOfSecondsException("Количество секунд превышает максимально возможное");
		}

		
		int minutes;
		minutes = secondsBeforeN / SECONDS_IN_MINUTE % MINUTES_IN_HOUR; 
		return minutes;
	}
	
	public static int calculateSeconds(int secondsBeforeN) throws WrongNumberOfSecondsException {
		if (secondsBeforeN < 0) {
			throw new WrongNumberOfSecondsException("Секунда не может быть отрицательной");
		} else if (secondsBeforeN == 0) {
			throw new WrongNumberOfSecondsException("Секунда не может быть нулевой");
		} else if (secondsBeforeN > SECONS_IN_DAY) {
			throw new WrongNumberOfSecondsException("Количество секунд превышает максимально возможное");
		}

		
		int seconds;
		seconds = secondsBeforeN % SECONDS_IN_MINUTE % MINUTES_IN_HOUR; 
		return seconds;
	}
	
}
