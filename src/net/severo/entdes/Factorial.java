package net.severo.entdes;
/**
 * 
 * @author Jorge Selva
 *
 */
public class Factorial {

	public static void main(String[] args) {
		String num= "lukumäärä ";
		String fact= "tekijäluku ";
		int n = (int) (Math.random() * 10);
		int result = 1;
		int i= 1;
		System.out.println(num + n);
		while (n >= i) {
			result = result * i;
			i++;
		}
		System.out.println(fact + result);

	}

}
