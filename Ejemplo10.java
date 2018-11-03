import java.util.*;
public class Ejemplo10{
 public static void main (String[] args){
	int suma= 0, num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca un número: ");
	num= sc.nextInt();
	while (num >= 0){
		suma= suma + num;
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
	}
System.out.println("la suma es:" + suma);
	}


}