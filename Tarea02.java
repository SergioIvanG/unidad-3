import java.util.*;
public class Tarea02{
 public static void main (String [] args){
	double A,B,C;
Scanner sc= new Scanner(System.in);
	System.out.println("INGRESE EL PRIMER NÚMERO");
	A= sc.nextDouble();
	System.out.println("INGRESE EL SEGUNDO NÚMERO");
	B= sc.nextDouble();
	System.out.println("INGRESE EL TERCER NÚMERO");
	C= sc.nextDouble();
        if (A==B || B==C || A==C){		
	while (A==B || B==C || A==C){
	System.out.println("!SE HAN INTRODUCIDO VALORES IGUALES VUELVA A ESCRIBIRLOS CORRECTAMENTE!");
	System.out.println("INGRESE EL PRIMER NÚMERO");
	A= sc.nextDouble();
	System.out.println("INGRESE EL SEGUNDO NÚMERO");
	B= sc.nextDouble();
	System.out.println("INGRESE EL TERCER NÚMERO");
	C= sc.nextDouble();
	}}
	if (A>B && B>C) {	
	System.out.println ("EL NUMERO MAYOR ES: "+ A);
	System.out.println ("EL NUMERO MENOR ES: "+ C);
	}
	else if (A>C && C>B){
	System.out.println ("EL NUMERO MAYOR ES: "+ A);
	System.out.println ("EL NUMERO MENOR ES: "+ B);
	}
	else if (B>C && C>A) {
	System.out.println ("EL NUMERO MAYOR ES: "+ B);
	System.out.println ("EL NUMERO MENOR ES: "+ A);
	}
	else if (B>A && A>C){
	System.out.println ("EL NUMERO MAYOR ES: "+ B);
	System.out.println ("EL NUMERO MENOR ES: "+ C);
	}
	else if (C>B && B>A){
	System.out.println ("EL NUMERO MAYOR ES: "+ C);
	System.out.println ("EL NUMERO MENOR ES: "+ A);
	}
	else {
	System.out.println ("EL NUMERO MAYOR ES: "+ C);
	System.out.println ("EL NUMERO MENOR ES: "+ B);
	}
	
 }
}
	
