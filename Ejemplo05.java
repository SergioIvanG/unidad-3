import java.util.*;
public class Ejemplo05{
public static void main (String[]args ){
Scanner sc= new Scanner(System.in);
System.out.println("Introdusca una hora (un valor entero): ");
int hora= sc.nextInt();
if (hora >=0 && hora < 12)
System.out.println("buenos dias");
else if (hora >=12 && hora < 21)
System.out.println("buenas tardes");
else if (hora >=21 && hora< 24)
System.out.println("buenas noches");
else 
System.out.println("hora no valida");
}
}