import java.io.IOException;
import java.util.Scanner;

public class Ex5 {
 
    public static void main(String[] args) throws IOException {
 
       
		Scanner s = new Scanner(System.in);
		
		double a , b, media;
		a = s.nextDouble();
		b = s.nextDouble();
		
		media = ((a * 3.5) + (b * 7.5)) / 11.0;
		
		System.out.printf("MEDIA = %.5f\n" , media);
		
		s.close();
 
    }
 
}