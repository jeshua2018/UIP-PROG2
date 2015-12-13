import java.util.Scanner;


public class CajeroPrincipal {
public static Scanner keyboard;
	public static void main( String[] args){
		
		
		int op,opc,n,k = 0;
		int pin1=1234;
		int pin,j;
		int y=0;
		
		keyboard = new Scanner(System.in);
		System.out.println("Bienvenido al cajero automatico");
		
		
		
		
		
		Funcion l= new Funcion();
		l.mostrar();
		op=keyboard.nextInt();
		
		if (op==1){
		do{
			System.out.println("Inserte la tarjeta");
			System.out.println("Ahora inserte su pin de tarjeta");
			pin=keyboard.nextInt();
			if(pin==pin1){
			Transaccion g= new Transaccion();
			g.mostrar();
			opc=keyboard.nextInt();
			
			switch (opc){
			case 1:
				System.out.println("De que cuenta desea realizar el retiro:1. corriente; 2. Ahorro");
				j=keyboard.nextInt();
				if (j==1){
				System.out.println("¿Cuanto desea retirar? -- Escriba la cantidad");
				n=keyboard.nextInt();
				System.out.println("Usted a retirado de la  cuenta corriente:  " + n);
				}
				else{
					System.out.println("¿Cuanto desea retirar? -- Escriba la cantidad");
					n=keyboard.nextInt();
					System.out.println("Usted a retiradode la cuenta de ahorro:  " + n);
				}
				break;
			case 2:
				System.out.println("Su saldo total es de:  ");
			}
			}
			else {
				y++;
				System.out.println("El pin que ha introducido es incorrecto\n" + "Vuelva a intentarlo\n" + "Presione una tecla diferente de uno para regresar el menu" );
			
			if (y==3){
				System.out.println("Su tarjeta se ha bloqueado por un dia");
			}
			}
		}while(k!=1);
		}
			else if(op==2){
				System.out.println("La maquina no entrara en funcionamiento hasta que termine el mantenimiento y vuelva a reiniciar");
				
			}
			else if(op==3){
				System.out.println("La maquina se ha apagado");
			}	
	}
		
		
		
	}