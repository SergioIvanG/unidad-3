import java.util.*;
public class Ejercicio01{
public static void main (String[] args){
double n;
Scanner sc= new Scanner(System.in);
System.out.print("Introduzca un numero: ");
n= sc.nextDouble();
while (n != 0){
if (n > 0) {
System.out.println("el numero es positivo");
}
else{
System.out.println("El numero es negativo");
}
System.out.println("Introduzca un numero:");
n= sc.nextDouble();
}}}