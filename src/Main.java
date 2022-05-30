import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Fib For
		for(int item : fib2(2))
		{
			if(item != 0) System.out.print(", ");
			System.out.print(item);
		}
		
		System.out.println();
		
		//Fib recursive
		for(int item : fib(10, new int[] {0, 1}))
		{
			if(item != 0) System.out.print(", ");
			System.out.print(item);
		}
	}
	
	//Fib calculated with For loop
	private static List<Integer> fib2(int num) {
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
	private static int[] fib(int num, int[] serie) {
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

}
