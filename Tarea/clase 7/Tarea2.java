import java.util.Scanner;
public class Tarea2 {

	/**
	 A un trabajador le pagan segun sus horas y una tarifa de pago por horas. Si 
	 la cantidad de horas trabajadas es mayor a 40 horas, la tarifa se incrementa en un 
	 50% para las horas extras. Usted debe calcular el salario para 5 trabajadores, obteniendo
	 su nombre y tarifa por teclado. Finalmente debe mostrar un reporte en pantalla que indique el nombre y 
	 el salario neto para cada uno de los trabajadores.
	 */
	public static void main(String[] args) {
		String nombre;
		int horas, n=1, horasx;
		float salH, salN;
		
		
		Scanner teclado = new  Scanner(System.in);
		
		while (n<=5){
		System.out.println("Introduzca Nombre: ");
		nombre=teclado.nextLine();
		System.out.println("Introduzca Horas trabajadas: ");
		horas=teclado.nextInt();
		System.out.println("Introduzca salario por hora: ");
		salH=teclado.nextFloat();
		
		
		
		if (horas>40){
		horasx=horas-40;
		salN= (float) ((40*salH)+((horasx*salH)*0.50));
		}
		
		else {
			salN=horas*salH;
		}
		
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Salarion Neto: "+salN);
		
		n++;
		}
	}
	}


