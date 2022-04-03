import java.io.IOException;
import java.util.Scanner; 

public class Ex4 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
		int a , b, prod;
		a = s.nextInt();
		b = s.nextInt();
		
		prod = a * b;
		
		System.out.println("PROD = " + prod);
		
		s.close();
    }
 
}