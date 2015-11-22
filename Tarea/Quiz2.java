import java.util.Scanner;
public class Quiz2 {
private static Scanner keyboard;
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		float Distancia;
		float Velocidad;
		float Tiempo;
          String P="s";
          Scanner b= new Scanner(System.in);
    while(P!="n")
    {
			
		keyboard = new Scanner (System.in);
         System.out.println("Ingrese Distacia y Velocidad: ");
         Distancia=keyboard.nextFloat();
         Velocidad=keyboard.nextFloat();
         
         Tiempo=(Distancia/Velocidad);
         System.out.println("Tiempo es: "+ Tiempo);
        
         System.out.println("Presione cualquier letra para continuar");
         P=b.next();
    }
		
         
         
		// TODO Auto-generated method stub

	}

}
