
import java.io.IOException;
import java.util.Scanner; 

public class Ex2 {
 
    public static void main(String[] args) throws IOException {
        
       double area, n = 3.14159, r;
       Scanner s = new Scanner(System.in);
       r = s.nextDouble();
       area = n * (r*r);
       System.out.printf("A=%.4f\n" , area);
       s.close();
    }
 
}