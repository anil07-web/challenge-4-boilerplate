import java.util.Scanner; 
class Demo {
    float fa;
    char c;
	public char celsiusToFahrenheit(float i){ 
    fa=9*i/5+32;
    Scanner obj = new Scanner(System.in); 
    System.out.println("Temperature(Celsius)= "+i+"       Temperature(Fahrenheit)= "+fa); 
    System.out.println("Do you wish to continue(y/n)?"); 
    c=obj.next().charAt(0); 
    return c; 
	}	
} 
class Task4 { 
    public static void main (String[] args) { 
         float a;
         char s;
        Scanner obj = new Scanner(System.in); 
        System.out.println("Enter the temperature in Degree Celsius:");
        a=obj.nextFloat();
        Demo t=new Demo();
		 s = t.celsiusToFahrenheit(a); 
		
        if(s=='y'||s=='Y')
        {
            System.out.println("Enter the temperature in Degree Celsius:");
            a=obj.nextFloat();
            s = t.celsiusToFahrenheit(a);
        }

		
	} 
} 
