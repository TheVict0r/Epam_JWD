package by.epamtc.task1.ex7.logic;

import by.epamtc.task1.ex7.entity.Point;

public class PointLogic {

	public static double calculateDistanceToZeroPoint(Point point) {
		double distance;
		int x = point.getX();
		int y = point.getY();
		
		distance = Math.sqrt(x*x + y*y);
		
		return distance;
	}
	
	public static String closerToZeroPointName (Point pointA, Point pointB) {
		
		double distanceA = calculateDistanceToZeroPoint(pointA);
		double distanceB = calculateDistanceToZeroPoint(pointB);
		
		String result;
		
		if(distanceA < distanceB) {
			result = "Ближе к началу координат находится точка " + pointA.getName() + ".";
		} else if(distanceB < distanceA) {
			result = "Ближе к началу координат находится точка " + pointB.getName() + ".";
		} else {
			result = "Точки " + pointA.getName() + " и " + pointB.getName() + " равноудалены от начала координат.";
		}
		
		return result;
	}
	
}
