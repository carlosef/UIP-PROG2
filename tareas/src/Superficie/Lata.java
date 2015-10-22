package Superficie;

import java.util.Scanner;


public class Lata 
{
	public double altura;
	
	 public double getAltura() {
		return altura;
	}

	 public void setAltura(double altura) {
		this.altura = altura;
	}


	 public double getDiametro() {
		return diametro;
	}


	 public void setDiametro(double diametro) {
		this.diametro = diametro;
	}


	 public double diametro;
	 
	 public static void main(String[] args) {
	
	System.out.println("introdusca los datos del volumen:");
		
	Lata obj = new Lata ();
	double d ;
	d = obj.altura(4.8);
	
	Lata obj1 = new Lata ();
	double c ;
	c= obj1.diametro(2.5);
	}

	private double altura(double d) {
		return 0;
	}
		
		private double diametro(double c) {
			// TODO Auto-generated method stub
			return 0;
	}

}
