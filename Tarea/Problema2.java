import java.util.*;
public class Problema2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int i=1;
        float n1, n2, n3, n4, n5, prom, menor;
		do {
			if (i>1){
				System.out.print("\n\nEstudiante #"+i);
			}
		System.out.print("\nIntroduzca Nota 1: ");
        n1 = leer.nextFloat();
        menor=n1;
        System.out.print("\nIntroduzca Nota 2: ");
        n2 = leer.nextFloat();
        if (n2<menor){
        	menor=n2;
        }
        System.out.print("\nIntroduzca Nota 3: ");
        n3 = leer.nextFloat();
        if (n3<menor){
        	menor=n3;
        }
        System.out.print("\nIntroduzca Nota 4: ");
        n4 = leer.nextFloat();
        if (n4<menor){
        	menor=n4;
        }
        System.out.print("\nIntroduzca Nota 5: ");
        n5 = leer.nextFloat();
        if (n5<menor){
        	menor=n5;
        }
        
        if (n1==menor){
        	prom=(n2+n3+n4+n5)/4;
        	System.out.print("\nNota eliminada: "+menor);
        	System.out.print("\nPromedio: " + prom);
        }
        
        else if (n2==menor){
        	prom=(n1+n3+n4+n5)/4;
        	System.out.print("\nNota eliminada: "+menor);
        	System.out.print("\nPromedio: " + prom);
        }
        
        else if (n3==menor){
        	prom=(n1+n2+n4+n5)/4;
        	System.out.print("\nNota eliminada: "+menor);
        	System.out.print("\nPromedio: " + prom);
        }
        
        else if (n4==menor){
        	prom=(n1+n2+n3+n5)/4;
        	System.out.print("\nNota eliminada: "+menor);
        	System.out.print("\nPromedio: " + prom);
        }
        
        else {
        	prom=(n1+n2+n3+n4)/4;
        	System.out.print("\nNota eliminada: "+menor);
        	System.out.print("\nPromedio: " + prom);
        }
			i++;
		}while (i<=3);

	}

}
