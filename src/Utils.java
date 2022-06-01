import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {
	//Fib calculated with For loop
	public static List<Integer> fib(int num) {
		List<Integer> serie = new ArrayList<Integer>();
		serie.add(0);
		serie.add(1);
		
		for(int x = 0; x < num -1; x++)
		{
			int suma = serie.get(serie.size() -2) + serie.get(serie.size() - 1);
			serie.add(suma);
		}
		
		return serie;
	}
	
	//Fib calculated with recursive function
	public static int[] fib(int num, int[] serie) {
		if(serie.length -1 == num) return serie;
		else {
			int[] temp = Arrays.copyOf(serie, serie.length + 1);
			temp[temp.length-1] = sum(serie);
			return fib(num, temp);
		}
	}
	
	//sum last 2 numbers from the given arr
	private static int sum(int[] serie)
	{
		return serie[serie.length-2] + serie[serie.length-1];
	}
	
	public static String reverseString(String input) {
		String output = ""; //temporal String
		
		for(int x = input.length()-1; x >= 0; x--) { //Reverse for loop
			output += input.charAt(x); //adds new chars into temporal String
		}
		return output;
	}
	
	public static int countWords(String input) {
		String fixed = input.trim().replaceAll(" +", " "); //removes duplicated spaces
		return fixed.split(Character.toString(32)).length; //returns number of elements in splitted string
	}
}
