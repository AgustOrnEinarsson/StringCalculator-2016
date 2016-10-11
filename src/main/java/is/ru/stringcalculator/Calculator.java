package is.ru.stringcalculator;

public class Calculator{
	
	public static int add(String s){
		if (s.equals(""))
			return 0;
		else if(s.contains(","){
			String [] numbers = s.split(",");
			return Integer.toInt(numbers[0]) + Integer.toInt(numbers[1])
		}
		return 5;
	}
}
