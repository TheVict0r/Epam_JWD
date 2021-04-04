package by.epamtc.task1.ex7.exception;

@SuppressWarnings("serial")
public class EmptyPointVariableException  extends Exception{
	// Не хотел называть NullPointException, чтобы не путалось с NullPointerException
	
	public EmptyPointVariableException() { 
		super("Point variable contains null");
	}

}
