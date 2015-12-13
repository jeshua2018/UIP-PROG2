import java.util.Scanner;
public class Menu  {
	Scanner teclado = new Scanner (System.in);
	int jub, tasA=0, tasL=0, tasP=0, C=0, P=0, L=0,H=0,n=0, soda=0, jugo=0, malt=0, op2,op3, resp;
    double monto = 0;
    String Cliente;
	public Menu (){
    do {
	System.out.println("\n------MENU DE COMIDA------\n1-Arroz - 0.50c La tasa \n2-Lenteja -  0.35 La tasa\n"
    		+ "3-Poroto - 0.40c \n4-Carne - 0.70\n5-Pollo - 0.50c\n6-Lasagna - B/.2.25\n7-Hamburguesa - B/.3.50\n8-Ninguna");
    op2=teclado.nextInt();
    
    switch(op2) {  
    case 1:
    	  System.out.println("\n---ARROZ---\n");
    	  System.out.println("Ingrese cantidad de tasas de arroz");
    	   tasA=teclado.nextInt();
    	   monto+=(0.50*tasA);
     break;
     
    case 2: 
     System.out.println("\n---LENTEJA---");
     System.out.println("Ingrese cantidad de tasas de lentejas");
	     tasL=teclado.nextInt();
	     monto+=(0.35*tasL);
     break;
     
    case 3:
    	System.out.println("\n---POROTO---");
        System.out.println("Ingrese cantidad de tasas de poroto");
 	     tasP=teclado.nextInt();
 	     monto+=(0.40*tasP);
     break;
     
    case 4:
    	System.out.println("\n---CARNE---");
        System.out.println("Ingrese cantidad de porciones de carne");
 	     C=teclado.nextInt();
 	     monto+=(0.70*C);
     break;
     
    case 5:
    	System.out.println("\n---POLLO---");
        System.out.println("Ingrese cantidad de porciones de pollo");
 	     P=teclado.nextInt();
 	     monto+=(0.50*P);
     break;
     
    case 6:
    	System.out.println("\n---LASAGNA---");
        System.out.println("Ingrese cantidad de lasagnas");
 	     L=teclado.nextInt();
 	     monto+=(2.25*L);
     break;
     
    case 7:
    	System.out.println("\n---HAMBURGUESA---");
        System.out.println("Ingrese cantidad de hamburguesas");
 	     H=teclado.nextInt();
 	     monto+=(3.50*H);
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
    switch(op3) {  
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
    System.out.println("\n"+"---FONDA PCII---\n---Restaurante Gourmet---\n-------------------------\nCliente < "+cliente+" >\n"
    		+ "-------------------------\n");
    System.out.println("ARROZ:.............."+tasA+"........B/. "+(tasA*0.50));
    System.out.println("LENTEJA:........"+tasL+"........B/. "+(tasL*0.35));
    System.out.println("POROTO:........"+tasP+"........B/. "+(tasP*0.40));
    System.out.println("CARNE:........"+C+"........B/. "+(C*0.70));
    System.out.println("POLLO:........"+P+"........B/. "+(P*0.50));
    System.out.println("LASAGNA:........"+L+"........B/. "+(L*2.25));
    System.out.println("HAMBURGUESA:........"+H+"........B/. "+(H*3.50));
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
    	 
while (n<5);

}
}

