package animales;

public class Perro extends Animal {

	public String sonido;
	
	public Perro(String color) {
		super(color);
	}

	@Override
	public String comunica() {
		sonido = "¡Guau, guau!!";
		return sonido;
	}

}
