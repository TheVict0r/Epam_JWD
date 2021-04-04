package by.epamtc.task1.ex2.exception;

public class ImpossibleMonthException extends Exception{
	 
	public ImpossibleMonthException() {
		super("The month must be between 1 and 12");
	}

}
