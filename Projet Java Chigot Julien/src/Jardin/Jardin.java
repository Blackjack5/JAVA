package Jardin;
import Flore.Vegetal;
import Flore.Ail;
import Flore.Betterave;
import Flore.Carotte;
import Flore.Etat;
import Flore.Tomate;

import java.util.HashMap;
import java.util.Scanner;

public class Jardin {
	private int longueur;
	private int largeur;
	private Emplacement emplacement[][];
	private HashMap<String, Integer> panier;
	public Jardin(int longueur, int largeur)  {
		this.longueur = longueur;
		this.largeur = largeur;
		this.emplacement = new Emplacement[longueur][largeur];
		this.panier = new HashMap<String, Integer>();
	}
	public void ajouterPanier(String nomDuVegetal, int quantite) {
		this.panier.put(nomDuVegetal, quantite);
	}
	public String toString() {
		String texte = "Voici notre jardin \n";

        for(int i=0; i< this.longueur; i++) {
            for(int j=0; j<this.largeur; j++) {
                Emplacement e = emplacement[i][j];
                if(e == null) {
                    texte += "o";
                }else {
                   
                }
            }
            texte += "\n";
        }

        texte += "Et notre panier contient: \n";

        ajouterPanier("Tomate", 5);
        ajouterPanier("Carotte", 5);
        ajouterPanier("Ail", 10);
        ajouterPanier("Betterave", 5);

        for (String k : panier.keySet()) {
            texte += k + " : " + panier.get(k) + " graine(s)\n";
        }

        return texte;
    }
	public void semer() {
		Scanner absisse = new Scanner(System.in);
        System.out.println("Choisissez la ligne où planter");
        int x = absisse.nextInt();

        Scanner ordonne = new Scanner(System.in);
        System.out.println("Choisissez la colonne où planter");
        int y = ordonne.nextInt(); 
        System.out.println("Choissez la Graine à planter");
        System.out.println("1. Ail  \n");
		System.out.println("2. Betterave  \n");
		System.out.println("3. Carotte \n");
		System.out.println("4. Tomate \n"); 
		Scanner graine = new Scanner(System.in);
		int plante = graine.nextInt();
		switch (plante) {
		case 1:
			 this.emplacement[x][y] = new Emplacement(new Ail(null, null));
			 break;
		case 2:
			 this.emplacement[x][y] = new Emplacement(new Betterave(null, null));
			 break;
		case 3:
			 this.emplacement[x][y] = new Emplacement(new Carotte(null, null));
			 break;
		case 4:
			 this.emplacement[x][y] = new Emplacement(new Tomate(null, null));
			 break;
		}
	}
	public void saisonSuivante() {
		 for(int x = 0; x<this.longueur; x++) {
	            for(int y = 0; y<this.largeur; y++) {
	            	if (this.emplacement[x][y] == null) {
	            		
	            	}
	            	else {
	            		this.emplacement[x][y].getVegetal().grandir();
	         }
	     }
	}
}
	public void recolter() {
		 for(int i=0; i< this.longueur; i++) {
	            for(int j=0; j<this.largeur; j++) {
	                Emplacement e = emplacement[i][j];
	                if(e.getVegetal().getEtat() == Etat.FLEUR) {
	                	this.emplacement[i][j] = null;
	               } else {
	            	   System.out.println("La Plante n'est pas arrivée à maturité");
	               }
	          }
		 }
	}
	public int getLongueur() {
		return this.longueur;
	}
	public int getLargeur() {
		return this.largeur;
	}
}