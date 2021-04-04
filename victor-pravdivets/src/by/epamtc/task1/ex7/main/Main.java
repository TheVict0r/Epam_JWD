package by.epamtc.task1.ex7.main;

import by.epamtc.task1.ex7.datarequest.RequestPoint;
import by.epamtc.task1.ex7.entity.Point;
import by.epamtc.task1.ex7.exception.EmptyPointVariableException;
import by.epamtc.task1.ex7.logic.PointLogic;
import by.epamtc.task1.ex7.presentation.Presentation;

/* 
 * Даны две точки А(х1, у1) и В(х2, у2). 
 * Составить алгоритм, определяющий, которая из точек находится 
 * ближе к началу координат. x y.
 */

public class Main {

	public static void main(String[] args) throws EmptyPointVariableException {

		Point pointA;
		Point pointB;

		System.out.println("Введите координаты для точки A:");
		pointA = RequestPoint.makePointWithDataFromConsole();
		pointA.setName("A");

		System.out.println("Введите координаты для точки B:");
		pointB = RequestPoint.makePointWithDataFromConsole();
		pointB.setName("B");

		Point closerPoint = PointLogic.defineCloserPoint(pointA, pointB);

		Presentation.printResult(closerPoint);
	}
}
