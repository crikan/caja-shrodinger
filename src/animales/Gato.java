package animales;

public class Gato extends Animal {

	public String sonido;
	
	public Gato(String color) {
		super(color);
	}
	
	@Override
	public String comunica() {
		sonido = "Miau";
		return sonido;
	}

}
