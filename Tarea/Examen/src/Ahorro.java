
public class Ahorro extends Cliente  {  //Se indica que la clase 'Ahorro' hereda de la clase 'Cliente'
	

	public Ahorro () {  //Constructor sin parametros      
    }

public Ahorro  (String nom, String ape,String se, float sal, String resi, 
int eda, String ce, int traba, String tel, float mon){ //constructor con parametros
super( nom,  ape, se,  sal,  resi, eda,  ce, traba,  tel, mon); //Se llama al constructor de la clase padre
nombre=nom;
apellido=ape;
sexo=se;
salario=sal;
residencia=resi;
edad=eda;
ced=ce;
trabaja=traba;
telefono=tel;
monto=mon;
}

public static void depositar() { //metodo para depositar dinero en la cuenta
System.out.println("\n"+"Introduzca cantidad a depositar en su cuenta de ahorro: ");
float m=teclado.nextFloat();
monto=monto+m;
System.out.println("Su saldo es de: "+monto);
}

public static void retirar() {      //Metodo para retirar dinero de la cuenta
System.out.println("\n"+"Introduzca cantidad a retirar de su cuenta de ahorro: ");
float r=teclado.nextFloat();

if (r>monto){  //Se verifica que el cliente tenga saldo en su cuenta
System.out.println("\n"+"¡Lo Sentimos! Saldo Insuficiente"); 
}

else {  //si es posible, se retira el dinero
monto=monto-r;
System.out.println("Su saldo es de: "+monto);}
}

public static void imprimir() {  //Metodo para consultar datos del cliente
System.out.println("\n"+nombre+"\n"+apellido+"\n"+residencia+"\n"+telefono+"\n"+edad+"\n"+ced+"\n"+trabaja+"\n"+sexo+"\n"+"Su monto es de "+monto);
}

public static void cuenta100() {  //Metodo para crear una cuenta con saldo B/.100.00 0 mas
int resp;

do{
System.out.println("\n"+"Datos Guardados"+"\n"+"Deposite monto inicial (mayor a B/100.00): ");
float dep=teclado.nextFloat();

if (dep<100) {  //se verifica que el monto es mayor 0 igual a B/.100.00
System.out.println("\n"+"¡La cantidad introducida no puede ser menor a 100 balboas!"+"\n"+"Su saldo es de B/0.00");
monto=0;
}

else {
monto=monto+dep;
System.out.println("\n"+"Su monto es de: "+monto);
}

System.out.println("\n"+"¿Desea depositar un monto adicional?"+"\n"+"Utilize 1 para depositar un monto adicional"+"\n"+"ó cualquier otra tecla para terminar la acción");
resp=teclado.nextInt();
}while (resp==1);
}

public static void cuenta0() {

System.out.println("\n"+"Esta opcion solo crea cuentas con un saldo inicial de cero"+"\n"+"Su monto es de B/0.00: ");
monto=0;


	}

}
