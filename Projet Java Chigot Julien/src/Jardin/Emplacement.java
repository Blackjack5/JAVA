package Jardin;

public class Emplacement {
	private Flore.Vegetal vegetal;
	public Emplacement(Flore.Vegetal vegetal) {
		this.vegetal = vegetal;
	}
	
	public Flore.Vegetal getVegetal() {
		return this.vegetal;
	}
	public void setVegetal(Flore.Vegetal vegetal) {
		this.vegetal = vegetal;
	}
}
