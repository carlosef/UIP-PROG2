
//A un trabajador le pagan segun sus horas y una tarifa de pago por horas.
//Si la cantidad de horas trabajadas es mayor a 40 horas, la tarifa se incrementa en un 50% para las horas extras.
//Usted debe calcular el salario para 5 trabajadores, obteniendo su nombre y tarifa por teclado.
//Finalmente debe mostrar un reporte en pantalla que indique
//el nmbre y el salario neto para cada uno de los trabajadores.//


package Salario;

public class Salario {
	public int horast;
	public int tarifa;
	public int horasex;
	private String nombre;
	
	         
	
	
	public double salario_neto(int horast ,int tarifa, int horasex)
	{
		
		
		double salario_neto = horast*tarifa ;
		
		if (horast >40);
		salario_neto =horast * tarifa +horasex *tarifa *.50;
		
		
		while (horast<40);
		
		salario_neto = horast*tarifa ;
		
		return salario_neto;
		
	}




	public double get(double horast){
		return horast;
	}




	public double sethorast(double horast){
		return this.horast = (int) horast;
	}




	public double getTarifa() {
		return tarifa;
	}




	public double setTarifa(double tarifa) {
		return this.tarifa = (int) tarifa;
	}




	public double getHorasex() {
		return horasex;
	}




	public double setHorasex(double horasex) {
		return this.horasex = (int) horasex;
	}




	public Object getNombre() {
		return nombre;
	}




	public static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}




	
	}







	
				
		
		
		
		
		
		
		
		
	
		
		
		
		
		
			




