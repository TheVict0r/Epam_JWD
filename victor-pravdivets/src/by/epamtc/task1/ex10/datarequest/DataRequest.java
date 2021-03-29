package by.epamtc.task1.ex10.datarequest;

import by.epamtc.task1.ex10.entity.DataBean;
import by.epamtc.task1.scanner.DataScanner;

public class DataRequest {

	public static DataBean requestData(){
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
		
		DataBean dataBean = new DataBean();
		dataBean.setA(a);
		dataBean.setB(b);
		dataBean.setH(h);
		
		return dataBean;
				
	}
	
}
