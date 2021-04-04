package by.epamtc.task1.ex7.presentation;

import by.epamtc.task1.ex7.entity.Point;

public class Presentation {

	public static void printResult(Point closerPoint) {
		if ("equal distance".equals(closerPoint.getName())) {
			System.out.println("Обе точки находятся на одинаковом расстоянии от начала координат.");
		} else {
			System.out.printf("Ближе к началу координат находится точка %s.", closerPoint.getName());
		}
	}
}
