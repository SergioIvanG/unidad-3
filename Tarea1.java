import java.util.*;
public class Tarea1{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
double num1, num2;
System.out.println("INGRESE EL PRIMER NUMERO:");
num1= sc.nextDouble();
System.out.println("INGRESE EL SEGUNDO NUMERO:");
num2=sc.nextDouble();
   if (num1>num2){
   System.out.println("EL NUMERO MAYOR ES"+ num1);
   }
   else
   System.out.println("EL NUMERO MAYOR ES: " + num2);
   }
}