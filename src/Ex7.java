import java.io.IOException;
import java.util.Scanner; 

public class Ex7 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
		
		int a , b, c, d, diferenca;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		diferenca = (a * b) - (c * d);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		s.close();
 
    }
 
}