import java.util.*;
public class Ejemplo03{
public static void main(String args []){
Scanner sc = new Scanner(System.in);
System.out.print("Nota: ");
int nota= sc.nextInt();
if(nota>=7){
System.out.println("En hora buena");
System.out.println("has aprovado");

}
else
System.out.println("lo siento ha reprobado");
}
}