package animales;

public class CajaShrodinger {

	public static void main(String[] args) {
		
		Animal[] cajas = new Animal[5]; //array de objetos
		Animal perro,gato; 
		int totalperros = 0; //variable para el total de perros
		int totalgatos = 0; //variable para el total de gatos
		
		//creación de los ojetos perro y gato
		perro = new Perro("negros");
		gato = new Gato("pardos");
		
	   //bucle para obtener aleatorios 1 o 2.
		for (int i = 0; i<cajas.length; i++) {
			int j = (int)(Math.random()*2+1);
			if (j==1)
				cajas[i]=perro;
			else
				cajas[i]=gato;
		}
		
		//bucle para ver qué hay en cada posición del array y volcar en las variables totales
		for(Animal anim:cajas) {
			if(anim instanceof Perro)
				totalperros = totalperros + 1;
			else
				totalgatos = totalgatos + 1;	
		}
		
		//Sentencias para la salida de consola
		System.out.println("Abrimos la caja y suena: " + perro.comunica());
		System.out.println("También suena: " + gato.comunica());
		System.out.println("En la caja hay: " + totalperros + " perros "
							+ perro.getColor() + " y " + totalgatos + " gatos "
							+ gato.getColor() + ". ¡Y están todos vivos!");		
		}
		
		system.out.println("ningún perro o gato ha sufrido daños durante este experimento");
	}
	


