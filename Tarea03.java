import java.util.*;
public class Tarea03{
  public static void main(String [] args){
	Scanner sc = new Scanner (System.in);
	System.out.println("INGRESE EL PRIMER NUMERO");
	double num1= sc.nextDouble();
	System.out.println("INGRESE EL SEGUNDO NUMERO");
	double num2= sc.nextDouble();
	if (num1<num2)
	System.out.println("EL ORDEN DE MENOR A MAYOR ES:" + num1 + ", " + num2 + "." );
	else if (num2<num1)
	System.out.println("EL ORDEN DE MENOR A MAYOR ES: " + num2 + ", " + num1 + ".");
	else
	System.out.println("LOS NUMEROS SON IGUALES");
	}
}