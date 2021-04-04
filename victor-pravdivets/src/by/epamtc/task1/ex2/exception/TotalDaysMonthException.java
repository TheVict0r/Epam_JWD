package by.epamtc.task1.ex2.exception;

public class TotalDaysMonthException extends Exception {

	public TotalDaysMonthException() {
		super("The month with such number of days does not exists");
	}
}
