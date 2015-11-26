//Elaborar un programa en Python que encueste a 10 personas y las clasifique según el deporte que practica. 
//La lista de deportes válidos son: Ajedrez, Atletismo, Baloncesto, Fútbol, Karate, Natación, Volleyball, Flag y Ping Pong. 
//Puede darse el caso que no le guste ninguno de los deportes anteriores. Si es así, entonces se puede seleccionar la opción Otros. 
//Al final el programa debe mostrar estadísticas de la encuesta e indicar cuál es el deporte con mayor preferencia
//de los encuestados.





public class Encuesta {
	

private int encuestados;
private int deporte ;
private string nombre;
public Encuesta ( string nombre,int encuestados, int deporte){
	 

	this.nombre =nombre;
	this.encuestados=encuestados;
	this.deporte=deporte ;
}

public string getNombre() {
	return nombre;
}

public void setNombre(int nombre) {
	
}

public int getEncuestados() {
	return encuestados;
}

public void setEncuestados(int encuestados) {
	this.encuestados = getEncuestados();
	if(encuestados>=1)encuestados++ ;
	
	
}

public int getDeporte() {
	return deporte;
}

public void setDeporte(int deporte) {
	this.deporte = deporte;
}

@Override
	public String toString()  {
		return "Encuesta :: ID = " + this.nombre + " nombre = " + this.encuestados + " deporte = " + this.deporte;
	}



}

