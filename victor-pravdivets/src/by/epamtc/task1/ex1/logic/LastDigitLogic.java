package by.epamtc.task1.ex1.logic;

public class LastDigitLogic {

	public static int calculateSquiresLastDigit(int wholeNumber) {

		int wholeNumberLastDigit = wholeNumber % 10;

		int squaresLastDigit = (wholeNumberLastDigit * wholeNumberLastDigit) % 10; 
							  // скобки поставил исключительно для наглядности
																					
		return squaresLastDigit;
	}

}
