package Salario;

import java.util.Scanner;


public class Pago {
	

	private static Scanner salario;
	
	

	public static void main(String[] args) {
		
	
		

salario = new Scanner (System.in);
		int horast = 0 ;
		double tarifa =0 ;
		int horasex = 0 ;
		double salario_neto  ;
		String nombre ;
		 
		System.out.println("Digitar nombre del empleado 1:");
		nombre = salario.next();
		
		System.out.println("Digitar horas trabajadas:");
		horast = salario.nextInt();
		
		System.out.println("Digitar tarifa:") ;
		tarifa = salario.nextDouble();
		
		System.out.println("Digitar horasex:") ;
		horasex = salario.nextInt();
		
		
		  if (horast >=41 );
			
			salario_neto = ((horast*tarifa)+(horasex*tarifa*.50));
			
			if (horast <=40);
				
			salario_neto = horast*tarifa ;
			
		System.out.println("Salario Neto:"+" "+salario_neto) ;
		
		System.out.println("Digitar nombre del empleado 2:");
		nombre = salario.next();
		
		System.out.println("Digitar horas trabajadas:");
		horast = salario.nextInt();
		
		System.out.println("Digitar tarifa:") ;
		tarifa = salario.nextDouble();
		
		System.out.println("Digitar horasex:") ;
		horasex = salario.nextInt();
		
		
		  if (horast >40 );
			
			salario_neto =  horast*tarifa+horasex*tarifa*.50;
			
			 if (horast <=40);
			 
			 salario_neto = horast*tarifa ; 
			 
		System.out.println("Salario Neto:"+" "+salario_neto) ;
		
		System.out.println("Digitar nombre del empleado 3:");
		nombre = salario.next();
		
		System.out.println("Digitar horas trabajadas:");
		horast = salario.nextInt();
		
		System.out.println("Digitar tarifa:") ;
		tarifa = salario.nextDouble();
		
		System.out.println("Digitar horasex:") ;
		horasex = salario.nextInt();
		
		
		  if (horast >40 );
			
			salario_neto =  horast*tarifa+horasex*tarifa*.50;
			
			 if (horast <=40);
			 
			 salario_neto = horast*tarifa ;
		System.out.println("Salario Neto:"+" "+salario_neto) ;
		
		
		System.out.println("Digitar nombre del empleado 4:");
		nombre = salario.next();
		
		System.out.println("Digitar horas trabajadas:");
		horast = salario.nextInt();
		
		System.out.println("Digitar tarifa:") ;
		tarifa = salario.nextDouble();
		
		System.out.println("Digitar horasex:") ;
		horasex = salario.nextInt();
		
		
		  if (horast >40 );
			
			salario_neto =  horast*tarifa+horasex*tarifa*.50;
			
			 if (horast <=40);
			 
			 salario_neto = horast*tarifa ;
		System.out.println("Salario Neto:"+" "+salario_neto) ;
		
		System.out.println("Digitar nombre del empleado 5:");
		nombre = salario.next();
		
		System.out.println("Digitar horas trabajadas:");
		horast = salario.nextInt();
		
		System.out.println("Digitar tarifa:") ;
		tarifa = salario.nextDouble();
		
		
		System.out.println("Digitar horasex:") ;
		horasex = salario.nextInt();
		
		
		  if (horast >40 );
			
			salario_neto =  horast*tarifa+horasex*tarifa*.50;
			
			 if (horast <=40);
			 
			 salario_neto = horast*tarifa ;
		System.out.println("Salario Neto:"+" "+salario_neto) ;





	}

	
	}

