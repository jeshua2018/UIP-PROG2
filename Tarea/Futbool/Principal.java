package ArabeUnido;

import java.util.Random;
import java.util.Scanner;


public class Principal extends Equipo {
public static Scanner keyboard;
	
public static void main(String[] args) {
		
		int o,b,c;
		int n=0;
      System.out.println("Bienvenido al equipo del Arabe unido");
 do{     
	keyboard=new Scanner(System.in);
System.out.println("Elija la opcion del partido");
System.out.println("1. Antes del partido");
System.out.println("2. Durante el partido");
System.out.println("3. Despues del partido");
o=keyboard.nextInt();

switch(o){
case 1:
	 
	Entrenador l=new  Entrenador();
	System.out.println("Entrenador: ");
	l.setNombre("Carlos");
	l.setApellido("Alba");
	 System.out.println("\nNombre: " + l.getNombre() + "\nApellido: " + l.getApellido());
	
	
	Jugador1 a= new Jugador1();
    a.setNombre("José");
    System.out.println("\nNombre: " + a.getNombre());
    a.concentrase();
    a.entrenar();
    
    
    
    Jugador2 z=new Jugador2();
    z.setNombre("Gilberto");
    System.out.println("\nNombre: " + z.getNombre());
    z.concentrase();
    z.entrenar();
    
    Jugador3 s=new Jugador3();
    s.setNombre("Manuel");
    System.out.println("\nNombre: " + s.getNombre());
    s.concentrase();
    s.entrenar();
    
    
    Jugador4 h=new Jugador4();
    h.setNombre("Juan");
    System.out.println("\nNombre: " + h.getNombre());
    h.concentrase();
    h.entrenar();
    
    Jugador5 k=new Jugador5();
    k.setNombre("Daniel");
    System.out.println("\nNombre: " + k.getNombre());
    k.concentrase();
    k.entrenar();
    
    Jugador6 j=new Jugador6();
    j.setNombre("Jimenez");
    System.out.println("\nNombre: " + j.getNombre());
    j.concentrase();
    j.entrenar(); 
    
    Jugador7 y=new Jugador7();
    y.setNombre("Yayo");
    System.out.println("\nNombre: " + y.getNombre());
    y.concentrase();
    y.entrenar();
    
    Jugador8 g=new Jugador8();
    g.setNombre("Gago");
    System.out.println("\nNombre: " + g.getNombre());
    g.concentrase();
    g.entrenar();
    
    Jugador9 w=new Jugador9();
    w.setNombre("Wolframio");
    System.out.println("\nNombre: " + w.getNombre());
    w.concentrase();
    w.entrenar();
    
    Jugador10 q=new Jugador10();
     q.setNombre("Quqo");
     System.out.println("\nNombre: " + q.getNombre());
     q.concentrase();
     q.entrenar();
     
     Jugador11 e=new Jugador11();
     e.setNombre("Elmio");
     System.out.println("\nNombre: " + e.getNombre());
     e.concentrase();
     e.entrenar();
       
       Masajista kl=new Masajista();
       kl.mostrar1();
       System.out.println("Le da masajes a los judadores de las camisetas numeros 12,13 y 14 \n");
       
	break;
	
case 2:
	
	Entrenador qw= new Entrenador();
	System.out.println("El entrenador arregla las jugadas");
	qw.mostrar();
	
	Jugador1 as= new Jugador1();
    as.setNombre("José");
    System.out.println("\nNombre: " + as.getNombre());
    as.mostrar();
    as.jugarPartidos();
    
    Jugador2 zl=new Jugador2();
    zl.setNombre("Gilberto");
    System.out.println("\nNombre: " + zl.getNombre());
    zl.mostrar();
    zl.jugarPartidos();
    
    Jugador3 sm=new Jugador3();
    sm.setNombre("Manuel");
    System.out.println("\nNombre: " + sm.getNombre());
    sm.mostrar();
    sm.jugarPartidos();
    
    
    Jugador4 hf=new Jugador4();
    hf.setNombre("Juan");
    System.out.println("\nNombre: " + hf.getNombre());
    hf.mostrar();
    hf.jugarPartidos();
    
    Jugador5 ks=new Jugador5();
    ks.setNombre("Daniel");
    System.out.println("\nNombre: " + ks.getNombre());
    ks.mostrar();
    ks.jugarPartidos();
    
    Jugador6 jw=new Jugador6();
    jw.setNombre("Jimenez");
    System.out.println("\nNombre: " + jw.getNombre());
    jw.mostrar();
    jw.jugarPartidos(); 
    
    Jugador7 yq=new Jugador7();
    yq.setNombre("Yayo");
    System.out.println("\nNombre: " + yq.getNombre());
    yq.mostrar();
    yq.jugarPartidos();
    
    Jugador8 ga=new Jugador8();
    ga.setNombre("Gago");
    System.out.println("\nNombre: " + ga.getNombre());
    ga.mostrar();   
    ga.jugarPartidos();
    
    
    Jugador9 wg=new Jugador9();
    wg.setNombre("Wolframio");
    System.out.println("\nNombre: " + wg.getNombre());
    wg.mostrar();
    wg.jugarPartidos();
    
    Jugador10 qd=new Jugador10();
     qd.setNombre("Quqo");
     System.out.println("\nNombre: " + qd.getNombre());
     qd.mostrar();
     qd.jugarPartidos();
     
     
     Jugador11 ea=new Jugador11();
     ea.setNombre("Elmio");
     System.out.println("\nNombre: " + ea.getNombre());
     ea.mostrar();
     ea.jugarPartidos();
     
     System.out.println("\n");
	break; 
case 3:
     Random lm=new Random();
     Random lk=new Random();
     
     int bg = lm.nextInt(10);
     int bj = lk.nextInt(10);
     
     if (bg < bj )
     {
         System.out.println("El resultado del partido es: " + bg + "-" + bj);
         System.out.println("Ni los jugadores ni el entrenador se sienten conforme con el resultado, el entrenador presionara mas a los jugadores para que entrenen mas fuerte");
         Jugador1 kj = new Jugador1();
         kj.comentario();
     }
     
     else if(bg>bj)
     {
    	 System.out.println("El resultado del partido es: " + bg + "-" + bj);
    	 System.out.println("El entrenador y los jugadores se sienten satisfechos de los resultador");
    	 Jugador1 hj=new Jugador1();
    	 hj.comentario1();
     }
     else if(bg==bj){
    	 System.out.println("El resultado del partido es: " + bg + "-" + bj);
    	 System.out.println("El entrenador y los jugadores opinan que fue un buen partido solo que les falto ganar");
    	 Jugador1 mn=new Jugador1();
    	 mn.comentario2();
     }
      Masajista re = new Masajista();
      re.setNombre("Jorales");
      System.out.println("\nNombre del Masajista:  " + re.getNombre());
      re.mostrar();
      re.mostrar1();
      
      Masajista rd = new Masajista();
      rd.setNombre("Lara");
      System.out.println("Nombre del Masajista:  " + rd.getNombre());
      rd.mostrar();
      rd.mostrar1();
      
      Masajista rf = new Masajista();
      rf.setNombre("jj");
      System.out.println("\nNombre del Masajista:  " + rf.getNombre());
      rf.mostrar1();
     
      
      
      System.out.println("si desea regresar al menu de eleccion presione una tecla diferente de 1 \n");
     break;
	
    }
 } while (n!=1);
	}

}
