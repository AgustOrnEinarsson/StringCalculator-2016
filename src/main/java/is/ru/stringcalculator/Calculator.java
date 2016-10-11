package is.ru.stringcalculator;

public class Calculator{
	
	public static int add(String s){
		if (s.equals(""))
			return 0;
		else if(s.contains(",")){
			String [] numbers = s.split(",");
			int sum = 0;
			for (int i = 0; i < numbers.length; i++){
				sum += getInt(numbers[i]); 
			}
			return sum;
		}
		return 1;
	}
	
	private static int getInt(String s){
		return Integer.parseInt(s);
	}

	
}
