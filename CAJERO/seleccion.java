package CAJERO;

public class seleccion {
private double seleccion ;
private double monto ;

public void setSeleccion(double seleccion) {
	this.seleccion = seleccion;
}

public double getSeleccion() {
	return seleccion;
}

public void setSeleccion(Object seleccion) {
	this.seleccion = (double) seleccion;
		
}

public double getMonto() {
	return monto;
}

public void setMonto(double monto) {
	this.monto = monto;
}
}
