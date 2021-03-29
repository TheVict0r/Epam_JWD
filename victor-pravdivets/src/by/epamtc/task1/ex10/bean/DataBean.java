package by.epamtc.task1.ex10.bean;


@SuppressWarnings("serial")
public class DataBean implements java.io.Serializable {

	int a;
	int b;
	int h;
	
	public DataBean () {
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		result = prime * result + h;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataBean other = (DataBean) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		if (h != other.h)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [a=" + a + ", b=" + b + ", h=" + h + "]";
	}
	
	
	
	
}
