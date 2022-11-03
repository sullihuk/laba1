import java.lang.*; // Подключение всех стандартных библиотек, включая 'Math', для вычисления синусов, косинусов и т.п. 
import java.util.Scanner; // Подключение возможности ввода с клавиатуры.

// Объявление класса.
class Triangle 
{
// Заполнение полей класса (Instance variables).
	double length_of_a; //
	double length_of_b; // Переменные вводимые с клавиатуры.
	double gamma;	    //

// Вычисляемые переменные.
	double length_of_c;
	double sin_is;
	double cos_is;
	double square_is;
	double perimeter_is;
	
// Метод вычисляет площадь треугольника. Имеет три параметра, среди которых sin_is является уже вычисленным значением синуса для заданного угла.
	public double square(double length_of_a, double length_of_b, double sin_is)
	{
		
		square_is = 0.5*length_of_a*length_of_b*sin_is;
		return square_is;

	}
// Метод вычисляет периметр треугольника. Также имеет три параметра, в том числе и заранее вычисленную длину третьей стороны.
	public double perimeter(double length_of_a, double length_of_b, double length_of_c)
	{
		perimeter_is = length_of_a+length_of_b+length_of_c;
		return perimeter_is;
	}
// Метод вычисляет значение синуса заданного угла. Параметром является угол вводимый пользователем с клавиатуры
	public double value_of_sinus(double gamma)
	{
		double gamma_norm = Math.toRadians(gamma); // Т.к. Java вычисляет синус угла заданного в радианах, а пользователь вводит угол в градусах, используется мет
		double sin_is = Math.sin(gamma_norm);      // тод toRadians для конвертации градусов в радианы.
		return sin_is;
	}
// Метод вычисляет значение косинуса заданного угла.
	public double value_of_cosinus(double gamma)
	{
		double gamma_norm = Math.toRadians(gamma); // Метод toRadians используется снова. 
		double cos_is = Math.cos(gamma_norm);
		return cos_is;
	}
// Метод вычисляет значение третьей, не заданной стороны треугольника.
	public double length_of_c(double length_of_a, double length_of_b, double cos_is)
	{
		// Для возведения в степень используется метод 'pow' вместо тривильного умножения переменных самих на себя, для взятия квадратного 		
		// радикала используется метод 'sqrt', однако, для этого возможно использовать метод 'pow' в следующем виде ' y = Math.pow(x, 0.5)';

		length_of_c = Math.sqrt(Math.pow(length_of_a,2) + Math.pow(length_of_b,2) - 2*cos_is*length_of_a*length_of_b);
		return length_of_c;

	}

}

public class laba1
{
	// Метод реализует ввод значений длин сторон треугольника с клавиатуры и проверяет введенное значение,
	// если значение меньше нуля просит пользователя ввести корректное значение. Очевидно, что длина 
	// любой из сторон плоского треугольника в евклидовой геометрии не может быть меньше нуля.
	
	public static double input_length(String phrase1, String phrase2) 
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
                        
                //System.out.println("You entered" + a);
                return a;
        }
	

	// Метод реализует ввод значений угла треугольника между его заданными сторонами с клавиатуры и проверяет введенное значение,
	// если значение меньше нуля и/или больше или равно 180 градусам просит пользователя ввести корректное значение. Очевидно, что любой  
	// из углов плоского треугольника в евклидовой геометрии не может быть меньше нуля и/или быть равным или больше 180 градусов.
	
	public static double input_an_angle(String phrase1, String phrase2)
	{
		System.out.println(phrase1 + phrase2);
                Scanner sc = new Scanner(System.in);
                double a = sc.nextDouble();
                 
		while (a <=0 || a>=180)
		{
			System.out.println("Enter the value from zero to 180 degrees but it can't be equal to zero: ");
			double b = sc.nextDouble();
			a = b;	
		} 
		return a;
	}

        public static void main(String[] args)
        {
		// Фразы для общения с пользователем.
		String valu0 = "Julia, please enter ";
		String valu1 = "length of 'a' side: ";
		String valu2 = "length of 'b' side: ";
		String valu3 = "an angle between 'a' and 'b' sides: ";


		// Присвоение переменным введенных c клавиатуры значений.
                double a_length = input_length(valu0, valu1);
		double b_length = input_length(valu0, valu2);
		double an_angle = input_an_angle(valu0, valu3);


		// Создание экземпляра класса.
		Triangle one = new Triangle();

		System.out.println("				=========================================");// Убогое украшение.
                System.out.println("				Square of your triangle is: " + one.square(a_length, b_length, one.value_of_sinus(an_angle))+ " square units."); // Вывод на экран значения вычисленной площади треугольника по двум сторонам и углу между ними. Методы вычислений вызываются прямо в строку.
		
		System.out.println("				+++++++++++++++++++++++++++++++++++++++++");// Ещё одно убогое украшение. :-)
                System.out.println("				Perimeter of your triangle is: " + one.perimeter(a_length, b_length, one.length_of_c(a_length, b_length, one.value_of_cosinus(an_angle)))+ " units.");// Вывод на экран значения вычисленного периметра треугольника заданного по двум сторонам и углу между ними. Методы вычислений также вызываются прямо в строку.


        } 


}
// Конец программы. :-)
