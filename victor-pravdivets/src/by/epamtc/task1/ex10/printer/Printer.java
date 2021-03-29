package by.epamtc.task1.ex10.printer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class Printer {

	public static void printResults (Map<Integer, Double> map) {
		List<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);
		
		System.out.println();
		System.out.println(" -------------------");
		System.out.println("   x  |     tg(x)   ");
		System.out.println(" ===================");
		
		for(Integer key : keys) {
			double tg = map.get(key);
			System.out.printf(" %4s | %10.5f\n ", key, tg);
			System.out.println("-------------------");
		}
		
	}
	
}
