import java.io.IOException;
import java.util.Scanner;

public class Ex9 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
		
		String nome;
				
		double salario, totVendas, total;
		nome = s.next();
		salario = s.nextDouble();
		totVendas = s.nextDouble();
		totVendas *= 0.15;
		total = salario + totVendas;
		
		System.out.printf("TOTAL = R$ %.2f\n" , total);
		
		s.close();
 
    }
 
}