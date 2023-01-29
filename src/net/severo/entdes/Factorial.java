package net.severo.entdes;
/**
 * 
 * @author Jorge Selva
 *
 */
public class Factorial {

	public static void main(String[] args) {
		String num= "numerus ";
		String fact= "faktorielle zahl ";
		int n = (int) (Math.random() * 10);
		int result = 1;
		System.out.println(num + n);
		while (n > 1) {
			result = result * (n - 1);
		}
		System.out.println(fact + result);

	}

}
