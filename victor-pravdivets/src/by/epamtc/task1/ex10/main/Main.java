package by.epamtc.task1.ex10.main;

import java.util.Map;

import by.epamtc.task1.ex10.bean.DataBean;
import by.epamtc.task1.ex10.datarequest.DataRequest;
import by.epamtc.task1.ex10.printer.Printer;
import by.epamtc.task1.ex10.tg.Tg;

/* Составить программу для вычисления значений 
 * функции F(x) на отрезке [а, b] с шагом h. 
 * Результат представить в виде таблицы, 
 * первый столбец которой – значения аргумента, 
 * второй - соответствующие значения функции 
 * F(x) = tg(x) 
 * */


public class Main {

	public static void main(String[] args) {

		DataBean dataBean = DataRequest.requestData();
		Map<Integer, Double> map = Tg.calculateTG(dataBean);
		Printer.printResults(map);
		
	}

}
