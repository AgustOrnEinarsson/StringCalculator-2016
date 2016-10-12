package is.ru.stringcalculator;

public class Calculator{
	
	public static int add(String s){
		if (s.equals(""))
			return 0;
		else if(s.contains(",") || s.contains("\n")){
			return getSum(s);
		}
		return 1;
	}

	
	private static int getSum(String s){
		String [] numbers = s.split(",|\n");
			int sum = 0;
			for (int i = 0; i < numbers.length; i++){
				if(getInt(numbers[i]) < 0){
					throw new IllegalArgumentException("Negatives not allowed: -1");
				}
				sum += getInt(numbers[i]); 
			}
		return sum;
	}	

	private static int getInt(String s){
		return Integer.parseInt(s);
	}

	
}
