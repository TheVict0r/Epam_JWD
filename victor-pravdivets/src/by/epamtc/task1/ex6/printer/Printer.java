package by.epamtc.task1.ex6.printer;

public class Printer {

	public static void printResults(int hours, int minutes, int seconds) {

		if (hours < 0) {
			//throw new IncorrectTimeException("Часы не могут быть отрицательными");
			//пока не реализовано
		} else if (hours > 59) {
			//throw new IncorrectTimeException("Количество часов превышает максимально возможное");
		}
		
		if (minutes < 0) {
			//throw new IncorrectTimeException("Минуты не могут быть отрицательными");
			//пока не реализовано
		} else if (minutes > 59) {
			//throw new IncorrectTimeException("Количество минут превышает максимально возможное");
		}

		if (seconds < 0) {
			//throw new IncorrectTimeException("Секунды не может быть отрицательными");
			//пока не реализовано
		} else if (seconds > 59) {
			//throw new IncorrectTimeException("Количество секунд превышает максимально возможное");
		}
		
		String gone;
		if (hours == 1) {
			gone = "прошел ";
		} else {
			gone = "прошло ";
		}

		String hoursStrRu = makeHoursRussianWording(hours);
		String minutesStrRu = makeMinutesRussianWording(minutes);
		String secondsStrRu = makeSecondsRussianWordings(seconds);

		String results = "К этому моменту " + gone + hours + hoursStrRu + ", " + minutes + minutesStrRu + ", " + seconds
				+ secondsStrRu + ".";

		System.out.println(results);

	}

	public static String makeHoursRussianWording(int hours) {
		
		if (hours < 0) {
			//throw new IncorrectTimeException("Часы не могут быть отрицательными");
			//пока не реализовано
		} else if (hours > 59) {
			//throw new IncorrectTimeException("Количество часов превышает максимально возможное");
		}
		
		String hoursStrRu;

		switch (hours) {
		case 1:
		case 21:
			hoursStrRu = " час";
			break;
		case 2:
		case 3:
		case 4:
		case 22:
		case 23:
			hoursStrRu = " часа";
			break;
		default:
			hoursStrRu = " часов";
		}

		return hoursStrRu;
	}

	public static String makeMinutesRussianWording(int minutes) {
		
		if (minutes < 0) {
			//throw new IncorrectTimeException("Минуты не могут быть отрицательными");
			//пока не реализовано
		} else if (minutes > 59) {
			//throw new IncorrectTimeException("Количество минут превышает максимально возможное");
		}
		
		String minutesStrRu;

		if (minutes >= 11 && minutes <= 14) {
			minutesStrRu = " минут";
		} else if (minutes % 10 == 1) {
			minutesStrRu = " минута ";
		} else if (minutes % 10 >= 2 && minutes % 10 <= 4) {
			minutesStrRu = " минуты";
		} else {
			minutesStrRu = " минут";
		}

		return minutesStrRu;
	}

	public static String makeSecondsRussianWordings(int seconds) {
		
		if (seconds < 0) {
			//throw new IncorrectTimeException("Секунды не может быть отрицательными");
			//пока не реализовано
		} else if (seconds > 59) {
			//throw new IncorrectTimeException("Количество секунд превышает максимально возможное");
		}
		
		String secondsStrRu;

		if (seconds >= 11 && seconds <= 14) {
			secondsStrRu = " секунд";
		} else if (seconds % 10 == 1) {
			secondsStrRu = " секунда";
		} else if (seconds % 10 >= 2 && seconds % 10 <= 4) {
			secondsStrRu = " секунды";
		} else {
			secondsStrRu = " секунд";
		}

		return secondsStrRu;
	}

}
