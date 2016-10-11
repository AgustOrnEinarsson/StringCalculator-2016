package is.ru.stringcalculator;

public class Calculator{
	
	public static int add(String s){
		if (s.equals(""))
			return 0;
		else if(s.contains(",")){
			String [] numbers = s.split(",");
			return getInt(numbers[0]) + getInt(numbers[1]);
		}
		return 1;
	}
	
	private static int getInt(String s){
		return Integer.parseInt(s);
	}

	
}
