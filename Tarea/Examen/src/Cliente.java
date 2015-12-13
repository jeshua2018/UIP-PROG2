import java.util.Scanner;
public class Cliente { // Clase 'Cliente' con sus respectivos datos
    public static  String nombre, apellido, residencia, sexo, ced, telefono;
    public static int edad, trabaja;
    public static float salario, monto;
    static Scanner teclado = new Scanner (System.in);  //se declara el scanner global para ahorrar codigo
    public Cliente () {  //constructor sin parametros, se obtienen los valores por teclado
        monto=0;
           System.out.println("Introduzca Nombre: ");
           nombre=teclado.nextLine();
           System.out.println("\nIntroduzca Apellido: ");
           apellido=teclado.nextLine();
           System.out.println("\nIntroduzca sexo: ");
           sexo=teclado.nextLine();
           System.out.println("\nIntroduzca Lugar de residencia: ");
           residencia=teclado.nextLine();
           int opc = 0;
   		do {	//le pregunta si trabaja, se repite hasta que ingrese una opcion diferente de 1 o 2
           System.out.println("\n¿Usted trabaja?: \n1.Si\n2.No");
           trabaja=teclado.nextInt();
           } while (opc<1 & opc >2);
           System.out.println("\nIntroduzca telefono: ");
           telefono=teclado.nextLine();
           System.out.println("\nIntroduzca ced: ");
           ced=teclado.nextLine();
           System.out.println("\nIntroduzca edad: ");
           edad=teclado.nextInt();
           if (opc==1){ // si la persona no trabaja, no tiene sentido preguntar por su salario
           System.out.println("\nIntroduzca salario: ");
           salario=teclado.nextFloat();
           }
           
   }
      public  Cliente  (String nombre, String apellido,String sexo, float salario, String residencia, int edad, 
   		   String ced, int trabaja, String telefono, float monto){ //Constructor con parametros
     Cliente.nombre=nombre;  
     Cliente.apellido=apellido;
     Cliente.residencia=residencia;
     Cliente.edad=edad;
     Cliente.ced=ced;
     Cliente.trabaja=trabaja;
     Cliente.telefono=telefono;
     Cliente.sexo=sexo;
     Cliente.salario=salario;
     Cliente.monto=monto;



	
	}

}
