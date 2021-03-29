package by.epamtc.task1.ex7.point;

public class Point {

	private int x;
	private int y;
	private String name;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.name = "noName";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+ " " + name + " x=" + x + ", y=" + y;
	}
	
	
	
}
