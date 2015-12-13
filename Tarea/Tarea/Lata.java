public class Lata {  
public static double altura, diametro, superficie, volumen; 

public Lata () {  
    
	altura=4.8;
	diametro=2.5;
    }
    

public  Lata  (double altura, double diametro){ 
Lata.altura=altura;  
Lata.diametro=diametro;
} 

public static void calcular_s(){
	superficie= ((3.1416*(diametro/2)*(diametro/2))+((2*3.1416)*((diametro/2)*altura)));
	System.out.println("Superficie: "+ superficie);
	
}

//PI * radio * radio * altura
public static void calcular_v(){
	volumen= ((3.1416*(diametro/2)*(diametro/2)*altura));
	System.out.println("volumen: "+ volumen);	
}

}



