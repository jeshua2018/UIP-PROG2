import java.util.Scanner;

public class Quiz {
        
		
	/**
	 * @param args
	 */
	private static Scanner keyboard;
	
	public static void main(String[] args) {
		
		
		double montc;
		double desc;
		
		keyboard = new Scanner (System.in);
		System.out.println("\ningrese monto de compra");
		montc=keyboard.nextDouble();
		
		if(montc>=500){
			desc=montc-(montc*0.3);
			System.out.println("\total:" + desc);
			}
		else if(montc==200 && montc<=500){
			desc=montc-(montc*0.2);
			System.out.println("\total: " + desc);
		}

		else if(montc==100 && montc<=200){
			desc=montc-(montc*0.1);
			System.out.println("\total:" + desc);
		}
		else if(montc<100){
			desc=montc-0;
			System.out.println("\total:" + desc);
	}
	}
		// TODO Auto-generated method stub

	}
