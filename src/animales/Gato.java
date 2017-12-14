package animales;

public class Gato extends Animal {

	public String sonido;
	
	public Gato(String color) {
		super(color);
	}
	
	@Override
	public String comunica() {
		sonido = "Mrrrrrra miau miau";
		return sonido;
	}

}
