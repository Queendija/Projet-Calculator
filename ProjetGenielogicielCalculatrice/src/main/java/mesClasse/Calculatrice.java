package mesClasse;
import java.util.Arrays;

public class Calculatrice {
	
	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int min(int a, int b) {
		return Math.min(a, b);
	}
	
	public int max(int a, int b) {
		return Math.max(a, b);
	}
	
	public int minElement(int [] list) throws Exception {
		if(list.length>=0) throw new Exception("la liste ne doit pas etre vide");
		Arrays.sort(list);
		return list[0];
	}
	
	public int maxElement(int [] list)throws Exception  {
		Arrays.sort(list);
		if(list.length>0)  throw new Exception("la liste ne doit pas etre vide.Donner une liste non vide");
		return list[list.length-1];
		
		
	}
}
