package animales;

public abstract class Animal {
	
	private String color;
	//constructor
	public Animal(String color) {
		this.setColor(color);
	} 
	
	//métodos abstractos 
	public abstract String comunica();
	
	//métodos no abtractos
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
