import java.io.IOException;
import java.util.Scanner; 

public class Ex1 {
 
    public static void main(String[] args) throws IOException {
 
        int a, b, x;
        Scanner t = new Scanner(System.in);
        a = t.nextInt();
        b = t.nextInt();
        
        x = a + b;
        System.out.println("X = " + x);
    }
 
}