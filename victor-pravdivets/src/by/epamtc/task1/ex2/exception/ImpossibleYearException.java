package by.epamtc.task1.ex2.exception;

public class ImpossibleYearException extends Exception{

	public ImpossibleYearException() {
		super("The year must be positive");
	}
	
}
