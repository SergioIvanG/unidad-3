import java.util.*;
 public class Ejemplo06{
public static void main(String[] args){
Scanner sc =  new Scanner (System.in);
 double nota;
System.out.println("introdusca una nota entre 0 y 10");
 nota= sc.nextDouble();
System.out.println("la calificacion del alumno es");
 if ( nota< 0 || nota >10)
System.out.println("nota no valida");
 else if (nota ==10)
System.out.println("matricula de honor");
 else if (nota >=9)
System.out.println("sobresaliente");
 else if (nota>= 8)
System.out.println("notable");
 else if (nota>=7)
System.out.println("notable");
 else
System.out.println("Suspenso");
}
}