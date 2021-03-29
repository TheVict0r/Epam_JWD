package by.epamtc.task1.ex6.main;

import by.epamtc.task1.ex6.datarequest.DataRequest;
import by.epamtc.task1.ex6.printer.Printer;

/*Идет n-я секунда суток, определить, сколько полных часов, 
 * полных минут и секунд прошло к этому моменту. 
 */

public class Main {

	public static void main(String[] args) {
		int secondsBeforeN;
		
		secondsBeforeN = DataRequest.requestSeconds();
		
		Printer.printResults(secondsBeforeN);
		
	}

}
