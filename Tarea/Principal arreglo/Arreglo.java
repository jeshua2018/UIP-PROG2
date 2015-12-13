import java.util.Scanner;
public class Arreglo {  //Se declara una clase 'Arreglo'
int num[]; // se declara un arreglo llamado 'num' de tipo entero
Arreglo(){  // constructor sin parametros, obtiene los valores del arreglo por teclado
num = new int [5]; // se indica la cantidad de numeros a guardar en el arreglo
Scanner teclado = new  Scanner(System.in); // se declara scanner para obtener los valores por teclado
int i=0;
for (i=0; i<5; i++){ // utilizamos el ciclo FOR para obtener los datos del arreglo
System.out.println("Introduzca el valor: "); 
num[i]=teclado.nextInt();  // se pide y se guardan los datos en el arreglo
}
}

int Sumar(){  // se declara un metodo 'Sumar', que va a sumar los valores guardados en el arreglo
int i=0, suma=0;
while (i<5){
suma+=num[i];
i++;
}
return suma; // se retorna el valor final de la suma
}
void Imprimir(){  // se declara un metodo 'Imprimir' que se va a utilizar en la clase principal para mostrar
              // los valores del arreglo y la suma
int i=0;
do {
System.out.println("Valor del elemento "+(i+1)+": "+num[i]); // se iran mostrando los valores del arreglo
i++;
}while(i<5);
System.out.println("Valor de la suma: "+ Sumar()); // muestra el resultado de la suma
}
}
