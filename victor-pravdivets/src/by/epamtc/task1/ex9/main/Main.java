package by.epamtc.task1.ex9.main;

import by.epamtc.task1.ex9.datarequest.RadiusRequest;
import by.epamtc.task1.ex9.logic.CircleLogic;

// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R 

public class Main {

	public static void main(String[] args) {
		int r;
		r = RadiusRequest.requestRadius();
		
		double length;
		double area;
		length = CircleLogic.calculateLength(r);
		area = CircleLogic.calculateArea(r);
		
		System.out.println("Длина окружности составляет " + length);
		System.out.println("Площадь круга составляет " + area);

	}

}
