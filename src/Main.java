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
		String word = "¿Hola  que       tal          estas?            ";
		System.out.println("numero de palabras en: '"+word+"' - "+Utils.countWords(word));
		System.out.println("numero de i encontradas en la palabra: InstanciaiiI = "+Utils.countCharacter('i', "InstanciaiiI"));
		System.out.println("Hamming distance: "+Utils.hammingDistance("patitosw", "paratosa"));
		System.out.println("Numero de vocales en 'Abecedario' : "+Utils.countVowels("Abecedario"));
		Utils.isPrime(13);
	}
}
