package by.epamtc.task1.ex4.main;

import by.epamtc.task1.ex4.datarequest.DataRequest;
import by.epamtc.task1.ex4.logic.EvenNumbersLogic;

/* Составить программу, печатающую значение true, 
 * если указанное высказывание является истинным, 
 * и false — в противном случае: 
 * среди заданных целых чисел А, В, С, D есть хотя бы два четных. 
 */


public class Main {
	public static void main(String[] args) {

		int[] numbersArr;
		numbersArr = DataRequest.recieveFourIntegersFromConsole();

		boolean checkResult;
		checkResult = EvenNumbersLogic.isTwoEvens(numbersArr);

		System.out.println(checkResult);

	}

}
