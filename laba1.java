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
		double gamma_norm = Math.toRadians(gamma);
		double sin_is = Math.sin(gamma_norm);
		return sin_is;
	}

	public double value_of_cosinus(double gamma)
	{
		double gamma_norm = Math.toRadians(gamma);
		double cos_is = Math.cos(gamma_norm);
		return cos_is;
	}

	public double length_of_c(double length_of_a, double length_of_b, double cos_is)
	{
		length_of_c = Math.sqrt(Math.pow(length_of_a,2) + Math.pow(length_of_b,2) - 2*cos_is*length_of_a*length_of_b);
		return length_of_c;

	}

}

public class laba1
{
	public static double input(String phrase1, String phrase2) 
        {
                System.out.println(phrase1 + phrase2);
                Scanner sc = new Scanner(System.in);
                double a = sc.nextDouble();
                                        
                while (a <=0 )
                {
                        System.out.println("Enter value more than zero: ");
                        double b = sc.nextDouble();
                        a = b;  
                } 
                        
                System.out.println("You entered" + a);
                return a;
        }

        public static void main(String[] args)
        {
		String valu0 = "Julia, please enter ";
		String valu1 = "length of a side: ";
		String valu2 = "length of b side: ";
		String valu3 = "an angle between a and b: ";

                double a_length = input(valu0, valu1);
		double b_length = input(valu0, valu2);
		double an_angle = input(valu0, valu3);
		Triangle one = new Triangle();


                System.out.println("Square of your triangle is: " + one.square(a_length, b_length, one.value_of_sinus(an_angle)));
		
                System.out.println("Perimeter of your triangle is: " + one.perimeter(a_length, b_length, one.length_of_c(a_length, b_length, one.value_of_cosinus(an_angle))));
 System.out.println("C will be: " + one.length_of_c(a_length, b_length, one.value_of_cosinus(an_angle)));

        } 


}
