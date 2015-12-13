import java.util.Scanner;
public class Parcial {

    /**
{     * @param args
     */ 
    public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in);
     int delivery, ComerRet = 0, op, op2, jub=0, resp, Arroz=0, Lenteja=0, Poroto=0, Carne=0, Pollo=0, Lasaña=0, Hambuerger=0, n=0, soda=0, jugo=0, malt=0;
     double monto = 0;
     String cliente;
     
    do{ 
    	System.out.println("Nombre de Cliente: ");
    	cliente=teclado.nextLine();
		
    	System.out.println("\nJubilado\n1-Si\n2-No: ");
    	jub=teclado.nextInt();
        do {
    	System.out.println("\n------MENU DE COMIDA------\n1-Arroz - 0.50c La tasa \n2-Lenteja -  0.35 La tasa\n"
        		+ "3-Poroto - 0.40c \n4-Carne - 0.70\n5-Pollo - 0.50c\n6-Lasagna - B/.2.25\n7-Hamburguesa - B/.3.50\n8-Ninguna");
        op=teclado.nextInt();
        
        switch(op) {  
        case 1:
        	  System.out.println("\n---ARROZ---\n");
        	  System.out.println("Ingrese cantidad de tasas de arroz");
        	   Arroz=teclado.nextInt();
        	   monto+=(0.50*Arroz);
         break;
         
        case 2: 
         System.out.println("\n---LENTEJA---");
         System.out.println("Ingrese cantidad de tasas de lentejas");
  	     Lenteja=teclado.nextInt();
  	     monto+=(0.35*Lenteja);
         break;
         
        case 3:
        	System.out.println("\n---POROTO---");
            System.out.println("Ingrese cantidad de tasas de poroto");
     	     Poroto=teclado.nextInt();
     	     monto+=(0.40*Poroto);
         break;
         
        case 4:
        	System.out.println("\n---CARNE---");
            System.out.println("Ingrese cantidad de porciones de carne");
     	     Carne=teclado.nextInt();
     	     monto+=(0.70*Carne);
         break;
         
        case 5:
        	System.out.println("\n---POLLO---");
            System.out.println("Ingrese cantidad de porciones de pollo");
     	     Pollo=teclado.nextInt();
     	     monto+=(0.50*Pollo);
         break;
         
        case 6:
        	System.out.println("\n---LASAGNA---");
            System.out.println("Ingrese cantidad de lasagnas");
     	     Lasaña=teclado.nextInt();
     	     monto+=(2.25* Lasaña);
         break;
         
        case 7:
        	System.out.println("\n---HAMBURGUESA---");
            System.out.println("Ingrese cantidad de hamburguesas");
     	     Hambuerger=teclado.nextInt();
     	     monto+=(3.50*Hambuerger);
               break;
               
        case 8:
            break;
           default:System.out.println("\n"+"¡Opción invalida! Introduzca un número dentro de las opciones");
        }
        
        System.out.println("Desea agregar algo mas \n1-Si\n2-No");
        resp=teclado.nextInt();
        } while (resp==1);
 
        System.out.println("\n------MENU DE BEBIDAS------\n1-Soda - B/1.00\n2-Jugo - B/.1.50\n3-Malteada - B/.2.00\n4-Ninguna");
        op2=teclado.nextInt();
        switch(op2) {  
        case 1:
        	  System.out.println("\n---SODA---\n");
        	  System.out.println("Ingrese cantidad de sodas");
        	   soda=teclado.nextInt();
        	   monto+=(1.00*soda);
         break;
         
        case 2: 
         System.out.println("\n---JUGO---");
         System.out.println("Ingrese cantidad de jugos");
  	     jugo=teclado.nextInt();
  	     monto+=(1.50*jugo);
         break;
         
        case 3:
        	System.out.println("\n---MALTEADA---");
            System.out.println("Ingrese cantidad de malteadas");
     	     malt=teclado.nextInt();
     	     monto+=(2.00*malt);
         break;
         
        case 4:
        break;
        default:System.out.println("\n"+"¡Opción invalida! Introduzca un número dentro de las opciones");
} 
        System.out.println("Seleccione 1. Para comer en restaurante"+"\n"+"2. Llevar comida");
        ComerRet=teclado.nextInt();
        if (ComerRet == 1){
        	System.out.println("Es para comer en el restaurante");
        }else{
        	System.out.println("Para LLevar");
        }
        
        System.out.println("\n"+"---FONDA PCII---\n---Restaurante Gourmet---\n-------------------------\nCliente < "+cliente+" >\n"
        		+ "-------------------------\n");
        System.out.println("ARROZ:.............."+Arroz+"........B/. "+(Arroz*0.50));
        System.out.println("LENTEJA:........"+Lenteja+"........B/. "+(Lenteja*0.35));
        System.out.println("POROTO:........"+Poroto+"........B/. "+(Poroto*0.40));
        System.out.println("CARNE:........"+Carne+"........B/. "+(Carne*0.70));
        System.out.println("POLLO:........"+Pollo+"........B/. "+(Pollo*0.50));
        System.out.println("LASAGNA:........"+Lasaña+"........B/. "+(Lasaña*2.25));
        System.out.println("HAMBURGUESA:........"+Hambuerger+"........B/. "+(Hambuerger*3.50));
        System.out.println("\nBebidas: ");
        System.out.println("SODA:........"+soda+"........B/. "+(soda*1.00));
        System.out.println("JUGO:........"+jugo+"........B/. "+(jugo*1.50));
        System.out.println("MALTEADAS:........"+malt+"........B/. "+(malt*2.00));
        System.out.println("SUB-TOTAL:                 B/. "+(monto));
        System.out.println("ITBMS:                     B/. "+(monto*0.07));
        double total=(monto*0.07)+monto; 
        System.out.println("TOTAL:                     B/. "+(monto*0.07+(monto)));
        if (jub==1){
        	double desc=total-(total*0.15);
        System.out.println("TOTAL A DESC POR JUBILADO 15%: B/. "+desc);	
        }
      
     
 }while (n<5);
     
 }
 }


    