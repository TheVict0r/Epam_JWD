package by.epamtc.task1.ex1.main;

import by.epamtc.task1.ex1.logic.LastDigitLogic;
import by.epamtc.task1.scanner.DataScanner;

/*
 * Написать программу, позволяющую по последней цифре числа 
 * определить последнюю цифру его квадрата.
 */

public class Main {

	public static void main(String[] args) {
		int wholeNumber;
		System.out.println("Пожалуйста, введите целое число:");
		wholeNumber = DataScanner.enterIntFromConsole();
		
		int squaresLastDigit;
		squaresLastDigit = LastDigitLogic.calculateSquiresLastDigit(wholeNumber);
		
		System.out.println("Последняя цифра квадрата этого числа будет - " + squaresLastDigit);

	}

}

