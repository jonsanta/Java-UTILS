import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utils {
	//Fib calculated with For loop
	public static List<Integer> fib(int num) {
		List<Integer> serie = new ArrayList();
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
		String output = "";
		
		for(int x = input.length()-1; x >= 0; x--) {
			output += input.charAt(x);
		}
		return output;
	}
}
