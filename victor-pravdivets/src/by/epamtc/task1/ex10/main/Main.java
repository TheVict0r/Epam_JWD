package by.epamtc.task1.ex10.main;

import java.util.Map;

import by.epamtc.task1.ex10.logic.Tg;
import by.epamtc.task1.ex10.printer.Printer;
import by.epamtc.task1.scanner.DataScanner;

/* Составить программу для вычисления значений 
 * функции F(x) на отрезке [а, b] с шагом h. 
 * Результат представить в виде таблицы, 
 * первый столбец которой – значения аргумента, 
 * второй - соответствующие значения функции 
 * F(x) = tg(x) 
 * */


public class Main {

	public static void main(String[] args) {

		
		int a, b;
		int h;
		
		do {
		System.out.println("Введите начальное значение диапазона (a):");
		a = DataScanner.enterIntFromConsole();
		
		System.out.println("Введите конечное значение диапазона (b):");
		b = DataScanner.enterIntFromConsole();
		
		
		System.out.println("Введите значение шага (h):");
		h = DataScanner.enterIntFromConsole();
		
		if (a > b) {
			System.out.println("Начальное значение (a) не может быть больше, чем конечное (b). Введите данные еще раз.");
		} else if (a + h > b) {
			System.out.println("Шаг не может превышать диапазон от a до b. Введите данные еще раз.");
		}
		
		} while ((a > b) || (a + h > b));
		
		
		
		Map<Integer, Double> map = Tg.calculateTG(a, b, h);
		Printer.printResults(map);
		
	}

}
