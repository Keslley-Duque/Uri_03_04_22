import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

public class Ex8 {
 
    public static void main(String[] args) throws IOException {
 
       Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		int num , horasTrab;		
		double salario, valorHora;
		num = s.nextInt();
		horasTrab = s.nextInt();
		valorHora = s.nextDouble();
		
		salario = horasTrab * valorHora;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		s.close();
    }
 
}