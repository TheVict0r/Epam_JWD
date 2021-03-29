package by.epamtc.task1.ex5.main;

/* 
 * Составить программу, печатающую значение 
 * true, если указанное высказывание является истинным, и 
 * false - в противном случае: 
 * является ли целое число совершенным 
 * (сумма делителей равна самому числу). 
 */

import by.epamtc.task1.ex5.logic.PerfectNumberLogic;
import by.epamtc.task1.scanner.DataScanner;

public class Main {

	public static void main(String[] args) {

			int num;
			System.out.println("Введите целое число:");
			num = DataScanner.enterIntFromConsole();

			boolean result;
			result = PerfectNumberLogic.isPerfectNumber(num);

			System.out.println(result);

		}

	}
