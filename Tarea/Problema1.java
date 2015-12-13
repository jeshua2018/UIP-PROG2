import java.util.*;
public class Problema1 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        float n1, n2, res;
       do {
        System.out.print("\nIntroduzca Número menor a 1000: ");
        n1 = leer.nextFloat();
        System.out.print("Introduzca otro Número menor a 1000: ");
        n2 = leer.nextFloat();
        if ((n1>1000) || (n1<0) || (n2>1000) || (n2<0)){
        	System.out.print("ERROR! Numero incorrecto, introduzca numeros nuevamente");
        	leer.nextLine();
        }
       } while ((n1>1000) || (n2>1000) || (n1<0) || (n2<0));
        res=n1+n2;
        if (res>0 && res<10){
        	System.out.print("Ambos numeros suman 1 digito ");
        }
        else if (res>0 && res<100){
        	System.out.print("Ambos numeros suman 2 digitos ");
        }
        else if (res>0 && res<1000){
        	System.out.print("Ambos numeros suman 3 digitos ");
        }
        else {
        	System.out.print("Ambos numeros suman 4 digitos ");
        }
        System.out.print("\nResultado: " + res);
        
	}
}
