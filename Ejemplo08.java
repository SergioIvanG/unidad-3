import java.util.*;
import java.io.*;
public class Ejemplo08 {
 public static void main(String [] arg) throws IOException{
 int A,B, resultado=0;
 char operador;
 boolean calculado= true;
 Scanner sc = new Scanner (System.in);
 System.out.print("Introdusca un número entero: ");
 A= sc.nextInt ();
 System.out.print("Introdusca otro número entero: ");
 B= sc.nextInt ();
 System.out.println("Introdusca un operador (+, -, *, /): ");
 operador = (char)System.in.read();
 switch (operador) {
	case '-': resultado= A-B;
		break;
	case '+': resultado= A+B;
		break;
	case '*': resultado= A*B;
		break;
	case '/': if (B!=0) 
			resultado= A/B;
			else{
			System.out.println("\nNo se puede dividir por cero");
			calculado = false;
			}
			break;
			default: System.out.println("\nOperador no valido");
			calculado = false;
		}
	if (calculado){
	System.out.println("\nEl resultado es: " + resultado );
}
}
}