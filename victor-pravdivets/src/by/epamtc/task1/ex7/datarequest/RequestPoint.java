package by.epamtc.task1.ex7.datarequest;

import by.epamtc.task1.ex7.point.Point;
import by.epamtc.task1.scanner.DataScanner;

public class RequestPoint {

	public static Point makePointWithDataFromConsole() {
		int x;
		int y;

		System.out.println("х:"); 
		x = DataScanner.enterIntFromConsole();
		
		System.out.println("y:"); 
		y = DataScanner.enterIntFromConsole();
		
		Point point = new Point(x, y);

		return point;
	}

}
