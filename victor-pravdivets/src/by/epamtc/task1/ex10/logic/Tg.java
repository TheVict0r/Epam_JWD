package by.epamtc.task1.ex10.logic;


import java.util.HashMap;
import java.util.Map;

import by.epamtc.task1.ex10.entity.DataBean;

public class Tg {

	public static Map<Integer, Double> calculateTG (DataBean dataBean){
		
		Map<Integer, Double> map = new HashMap<>();
		
		int a = dataBean.getA();
		int b = dataBean.getB();
		int h = dataBean.getH();
		
		for(int i = a; i <= b; i += h) {
			double tg = Math.tan(i);
			map.put(i, tg);
		}
		
		return map;
	}
	
	
}
