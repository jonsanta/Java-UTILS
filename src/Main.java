public class Main {

	public static void main(String[] args) {
		
		//Fib For
		for(int item : Utils.fib(2))
		{
			if(item != 0) System.out.print(", ");
			System.out.print(item);
		}
		
		System.out.println();
		
		//Fib recursive
		for(int item : Utils.fib(10, new int[] {0, 1}))
		{
			if(item != 0) System.out.print(", ");
			System.out.print(item);
		}
		
		System.out.println("\n"+Utils.reverseString("Hola"));
	}
}
