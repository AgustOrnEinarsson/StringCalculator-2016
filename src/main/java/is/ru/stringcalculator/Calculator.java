package is.ru.stringcalculator;

public class Calculator{
	
	public static int add(String s){

		if (s.equals(""))
			return 0;
		//get all integers into a vector
		int[] n = convertToInt(s);
		checkInput(n);

		if(s.contains(",") || s.contains("\n")){
			return getSum(s);
		}
		
		return 1;
	
}

	private static int getSum(String s){
		String [] numbers = s.split(",|\n");
			int sum = 0;
			for (int i = 0; i < numbers.length; i++){
				checkInput(getInt(numbers[i]));
				if(getInt(numbers[i]) > 1000)
					continue;
				sum += getInt(numbers[i]); 
			}
		return sum;
	}

	private static int[] convertToInt(String s){
		String [] numbers = s.split(",|\n");
		int[] n =new int[numbers.length];
		for (int i = 0; i < numbers.length; i++){
			n[i] = getInt(numbers[i]);
		}
		return n;
	}	
	

	private static void checkInput(int[] n){
		String s = "";
		for (int i = 0; i< n.length; i++){
			if(n[i] < 0)
			   s += n + ",";		
		}
		
		if(!s.isEmpty()){
			//Remove last comma
			s = s.substring(0, s.length() - 1);
			String errorM = "Negatives not allowed: " + s;
			throw new IllegalArgumentException(errorM);
		}
	}
	private static void checkInput(int n){
		if(n < 0){
			String errorM = "Negatives not allowed: " + Integer.toString(n);
			throw new IllegalArgumentException(errorM);
		}
	}
	
		

	private static int getInt(String s){
		return Integer.parseInt(s);
	}

	
}
