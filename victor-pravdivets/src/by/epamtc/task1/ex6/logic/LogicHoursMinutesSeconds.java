package by.epamtc.task1.ex6.logic;



public class LogicHoursMinutesSeconds{
	
public static final int SECONDS_IN_MINUTE = 60;
public static final int MINUTES_IN_HOUR = 60;
	
	public static int calculateHours(int secondsBeforeN) {
		int hours;
		hours = secondsBeforeN / SECONDS_IN_MINUTE / MINUTES_IN_HOUR;
		
		return hours;
	}
	
	public static int calculateMinutes(int secondsBeforeN) {
		int minutes;
		minutes = secondsBeforeN / SECONDS_IN_MINUTE % MINUTES_IN_HOUR; 
		
		return minutes;
	}
	
	public static int calculateSeconds(int secondsBeforeN) {
		int seconds;
		seconds = secondsBeforeN % SECONDS_IN_MINUTE % MINUTES_IN_HOUR; 
		
		return seconds;
	}
	
}
