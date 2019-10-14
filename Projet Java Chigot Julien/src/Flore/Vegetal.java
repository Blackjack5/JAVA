package Flore;
public abstract class Vegetal {
	protected String dessin[];
	protected Etat etat;
	public Vegetal(String etat, String dessin[]) {
		System.out.println("Ce Tableau contient 6 emplacements");
		System.out.println(dessin[0]);
		System.out.println(dessin[1]);
		System.out.println(dessin[2]);
		System.out.println(dessin[5]);
		this.etat = Etat.GRAINE;
		this.dessin = new String[6];	
		}
	public void grandir() {
		if (etat == Etat.MORT) {
	
		}
		this.etat=Etat.values()[this.etat.ordinal()+1];
	}
	public Etat getEtat() {
		return this.etat;
	}
}
