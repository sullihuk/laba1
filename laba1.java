import java.lang.*;
import java.util.Scanner;

class Triangle 
{

	double length_of_a;
	double length_of_b;
	double gamma;
	double length_of_c;
	double sin_is;
	double cos_is;
	double square_is;
	double perimeter_is;
	

	public double square(double length_of_a, double length_of_b, double sin_is)
	{
		
		square_is = 0.5*length_of_a*length_of_b*sin_is;
		return square_is;

	}

	public double perimeter(double length_of_a, double length_of_b, double length_of_c)
	{
		perimeter_is = length_of_a+length_of_b+length_of_c;
		return perimeter_is;
	}

	public double value_of_sinus(double gamma)
	{
		gamma_norm = Math.toRadians(gamma);
		value_is = Math.sin(gamma_norm);
		return sin_is;
	}

	public double value_of_cosinus(double gamma)
	{
		gamma_norm = Math.toRadians(gamma);
		value_is = Math.cos(gamma_norm);
		return cos_is;
	}

	public double length_of_c(double length_of_a, double lenth_of_b)
	{
		length_of_c = Math.sqrt(length_of_a*length_of_a + length_of_b*length_of_b - 2*cos_is*length_of_a*length_of_b);
		return length_of_c;

	}

public static double input() 
        {
                System.out.println("Enter value: ");
                Scanner sc = new Scanner(System.in);
                double a = sc.nextDouble();
                                        
                while (a <=0 || a>=180)
                {
                        System.out.println("Enter value more than zero: ");
                        double b = sc.nextDouble();
                        a = b;  
                } 
                        
                // System.out.println("You entered" + a);
                return a;
        }

        /* public static void main(String[] args)
        {
                double an_angle = gamma();
                System.out.println("You entered" + an_angle);
 
                        } */

}



public class laba1

{
}
