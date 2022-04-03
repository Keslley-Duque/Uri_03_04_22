import java.io.IOException;
import java.util.Scanner; 

public class Ex3 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
		int a , b, soma;
		a = s.nextInt();
		b = s.nextInt();
		
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		s.close();
    }
 
}