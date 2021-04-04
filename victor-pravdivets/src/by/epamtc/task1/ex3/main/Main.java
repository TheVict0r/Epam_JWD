package by.epamtc.task1.ex3.main;

/*
 * Окружность вписана в квадрат заданной площади. 
 * Найти площадь квадрата, вписанного в эту окружность. 
 * Во сколько раз площадь вписанного квадрата меньше площади заданного? 
 */

import by.epamtc.task1.ex3.datarequest.DataRequest;
import by.epamtc.task1.ex3.logic.SquareRoundLogic;

public class Main {

	public static void main(String[] args) {
		double outerSquareArea;
		outerSquareArea = DataRequest.enterSquareArea();
		
		double innerSquareArea;
		innerSquareArea = SquareRoundLogic.calculateInnerSquareArea(outerSquareArea);
		
		System.out.printf("Площадь квадрата, вписанного в окружность, составляет %s.", innerSquareArea);
		System.out.println();	
		System.out.printf("Вписанный квадрат в %s раза меньше заданного.", 
				SquareRoundLogic.compareSquaresAreas(innerSquareArea, outerSquareArea));	
		
	}
	
	
}