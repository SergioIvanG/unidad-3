import java.util.*;
public class Tarea05{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("INGRESE UN NUMERO DEL 0 AL 9,999 (NUEVE MIL NOVECIENTOS NOVENTA Y NUEVE)");
 int num= sc.nextInt();
	if (num<10000 && num>999)
	System.out.println ("EL NÚMERO TIENE 4 CIFRAS");
	else if (num<1000 && num>99)
	System.out.println ("EL NUMERO TIENE 3 CIFRAS");
	else if (num<100 && num>9)
	System.out.println ("EL NUMERO TIENE 2 CIFRAS");
	else if (num<10 && num>=0)
	System.out.println ("EL NUMERO TIENE 1 CIFRA");
	else
	System.out.println ("¡NUMERO INCORRECTO VUELVA A ESCRIBIR EL NÚMERO EN EL INTERVALO INDICADO!");
  }
 }
