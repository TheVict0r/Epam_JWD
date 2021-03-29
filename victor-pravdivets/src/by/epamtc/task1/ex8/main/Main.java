package by.epamtc.task1.ex8.main;

import by.epamtc.task1.ex8.logic.LogicForX;
import by.epamtc.task1.scanner.DataScanner;

/* Вычислить значение функции
 * 2 функции  в зависимости от сравнения x и 3 - 
 * сами функции не могу скопировать из PDF
 */

public class Main {

	public static void main(String[] args) {
		int x;
		
		System.out.println("Введите значение х:");
		x = DataScanner.enterIntFromConsole();
		
		double result;
		result = LogicForX.selectAndRunFormula(x);
		
		System.out.println(result);

	}

}
