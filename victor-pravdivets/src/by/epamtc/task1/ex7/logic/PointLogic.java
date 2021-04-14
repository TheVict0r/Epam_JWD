package by.epamtc.task1.ex7.logic;

import by.epamtc.task1.ex7.entity.Point;


public class PointLogic {

	public static double defineDistanceZero(Point point) {
		
		if (point == null) {
			//throw new EmptyPointVariableException(point);
			//пока не реализовано
		}
		
		double distance;
		int x = point.getX();
		int y = point.getY();
		
		distance = Math.sqrt(x*x + y*y);
		
		return distance;
	}
	
	public static Point defineCloserPoint (Point pointA, Point pointB) {
		
		if (pointA == null) {
			//throw new EmptyPointVariableException(pointA);
			//пока не реализовано
		}
		
		if (pointB == null) {
			//throw new EmptyPointVariableException(pointB);
			//пока не реализовано
		}
		
		double distanceA = defineDistanceZero(pointA);
		double distanceB = defineDistanceZero(pointB);
		
		Point result = new Point();
		result.setName("equal distance");
		result.setX(pointA.getX());
		result.setY(pointA.getY());
		
		if(distanceA < distanceB) {
			result = pointA;
		} else if(distanceB < distanceA) {
			result = pointB;
		}
		
		return result;
	}
	
}
