import java.util.Scanner;
public class Principal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
	     int op,op3,resp,op2, jub=0, tasA=0, tasL=0, tasP=0, cC=0, cP=0, cL=0, cH=0, n=0, soda=0, jugo=0, malt=0;
	     double monto = 0;
	     String cliente;
	    
	     
	     System.out.println("Introduzca el nombre del Cliente");
	    cliente=teclado.nextLine();
	    System.out.println("\nJubilado\n1-Si\n2-No: ");
	    jub=teclado.nextInt();
	     
	     do{ //muestra un menu con las opciones para el cliente
	         System.out.println("\n"+"Elija la Opcion que Desea"+"\n"+"1. Para comer en Restaurante"+"\n"+"2.Para llevar la comida."+"\n");
	         op=teclado.nextInt();
		
	         
	         if(op == 1){
	         System.out.println("Elijio comer en el restaurante");
	         do{ //muestra un menu con las opciones para el cliente
	             System.out.println("\n"+"Elija una de las siguientes Mesas "+"\n"+"1-Mesa 1."+"\n"+"2-Mesa 2."
	             +"\n"+"3-Mesa 3."+"\n"+"4-Mesa 5"+"\n"+"salir 6."+"\n");
	             op=teclado.nextInt();
	             switch(op){  //dependiendo de la opc introducia , se realiza su respectiva accion
	             case 1:
	                    System.out.println("\nElijio la Mesa 1");
	        			new Menu(); //se crea un objeto de tipo Menu
	                 break;
	                case 2: 
	                    System.out.println("\n"+"Elijio la Mesa 2");
	        			Menu c=new Menu();
	        			//c.//se crea un objeto de tipo Menu
	                    
	                    break;
	                case 3:
	                    System.out.println("\n"+"Elijio la Mesa 3");
	        			new Menu(); //se crea un objeto de tipo Menu
	                    break;
	                    
	                case 4:
	                    System.out.println("\n"+"Elijio la Mesa 4");
	                    new Menu();//se crea un objeto de tipo Menu
	                    break;
	                    
	                case 5:
	                    System.out.println("\n"+"Elijio la Mesa 5");
	                    new Menu();//se crea un objeto de tipo Menu
	                    break;
	                 
	                   case 6:
	                    System.out.println("\n"+"¡Esta a punto de finalizar el programa!");
	                       break;
	                      default:System.out.println("\n"+"¡Opción invalida! Introduzca un número dentro de las opciones");
	                   }
	                   System.out.println("\n"+"¿Desea regresar al menu principal? "+"\n"+"Utilize 1 para seguir ejecutando"+"\n"+"ó cualquier otra para finalizar el programa definitivamente");    
	                   resp=teclado.nextInt();
	           } while (resp==1);
	         
	         }
	         else if(op == 2){
	        	 System.out.println("Elijio llevar la comida");
	        	 new LLevar();
	         }
	   
	         System.out.println("\n"+"¿Desea regresar al menu principal? "+"\n"+"Utilize 1 para cambiar de opcion"+"\n"+"ó cualquier otra para finalizar el programa definitivamente");    
             resp=teclado.nextInt();
     } while (resp==1);

}
}