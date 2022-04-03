import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		int codP1, numP1, codP2, numP2;
		double valorP1, valorP2, total;
		
		codP1 = s.nextInt();
		numP1 = s.nextInt();
		valorP1 = s.nextDouble();
		
		codP2 = s.nextInt();
		numP2 = s.nextInt();
		valorP2 = s.nextDouble();
		
		total = (numP1 * valorP1) + (numP2 * valorP2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
	}
}
