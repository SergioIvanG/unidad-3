import java.util.*;
 public class Ejemplo11 { 
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n, contador = 0; 
System.out.print("Introduce un número: "); 
n = sc.nextInt();
 while (contador < n){ 
System.out.println(" * ");
 contador++; 
}
}
}