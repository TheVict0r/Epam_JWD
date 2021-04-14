package by.epamtc.task1.ex10.logic;


import java.util.HashMap;
import java.util.Map;

public class Tg {

		public static Map<Integer, Double> calculateTG (int a, int b, int h){
		
			if (a > b) {
				//throw new InconsistentDataException("Начальное значение не может быть больше, чем конечное.");
				//пока не реализовано
			} else if (a + h > b) {
				//throw new InconsistentDataException("Шаг не может превышать диапазон между начальными и конечными данными.");
				//пока не реализовано
			}
			
			
		Map<Integer, Double> map = new HashMap<>();
		
		for(int i = a; i <= b; i += h) {
			double tg = Math.tan(i);
			map.put(i, tg);
		}
		
		return map;
	}
	
	
}
