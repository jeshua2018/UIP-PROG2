import java.util.Scanner;
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
	     int op, resp;
	     do{ //muestra un menu con las opciones para el cliente
	         System.out.println("\n"+"Elija una de las siguientes opciones"+"\n"+"1-Crear cliente."+"\n"+"2-Crear cuenta de ahorro con saldo 0."
	         +"\n"+"3-Crear cuenta de ahorro con saldo mayor a B/.100.00"+"\n"+"4-Depositar"+"\n"+
	          "5-Retirar"+"\n"+"6-Consultar"+"\n"+"7.Cerrar");
	         op=teclado.nextInt();

	         switch(op){  //dependiendo de la opc introducia , se realiza su respectiva accion
	         case 1:
	                System.out.println("\nElijio la opción 1\nIntroduzca sus datos");
	    			new Cliente(); //se crea un objeto de tipo Cliente
	             break;
	            case 2: 
	                System.out.println("\n"+"Elijio la opción 2"+"\n"+"Introduzca sus datos para la creación de su cuenta");
	    			new Ahorro(); //se crea un objeto de tipo ahorro
	                Ahorro.cuenta0(); // se llama al metodo 'cuenta0' de tipo ahorro
	                break;
	            case 3:
	                System.out.println("\n"+"Elijio la opción 3"+"\n"+"Introduzca sus datos y un monto mayor a B/.100.00 para crear su cuenta");
	    			new Ahorro(); //se crea un objeto de tipo ahorro
	                Ahorro.cuenta100(); // se llama al metodo 'cuenta100' de tipo ahorro
	                break;
	            case 4:
	                System.out.println("\n"+"Elijio la opción 4, Depositar");
	                Ahorro.depositar(); // se llama al metodo depositar de tipo ahorro
	                break;
	               case 5:
	                System.out.println("\n"+"Elijio la opción 5, Retirar");
	                Ahorro.retirar();  // se llama al metodo retirar de tipo ahorro
	                break;
	               case 6:
	                System.out.println("\n"+"Elijio la opción 6, Consultar Información y Saldo");
	                Ahorro.imprimir(); // se llama al metodo imprimir de tipo ahorro
	                break;
	               case 7:
	                System.out.println("\n"+"¡Esta a punto de finalizar el programa!");
	                   break;
	                  default:System.out.println("\n"+"¡Opción invalida! Introduzca un número dentro de las opciones");
	               }
	               System.out.println("\n"+"¿Desea regresar al menu principal? "+"\n"+"Utilize 1 para seguir ejecutando"+"\n"+"ó cualquier otra para finalizar el programa definitivamente");    
	               resp=teclado.nextInt();
	       } while (resp==1);



	}

}
