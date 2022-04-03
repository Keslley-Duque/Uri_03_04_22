import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

public class Ex6 {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		double a , b, c, media;
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		
		media = ((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10.0;
		
		System.out.printf("MEDIA = %.1f\n" , media);
		
		s.close();
    }
 
}