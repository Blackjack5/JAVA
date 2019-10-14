package Jardin;
import Flore.Vegetal;
import java.util.Scanner;

public class Terre {
	public static void main(String[] args) {
		Jardin J1 = new Jardin(5,5);
		J1.ajouterPanier("Ail", 5);
		J1.ajouterPanier("Betterave", 2);
		J1.ajouterPanier("Carotte", 3);
		J1.ajouterPanier("Tomate", 4);
		System.out.print(J1.toString());
		Scanner choix  = new Scanner(System.in);
		System.out.println("Choisissez une action : AVEC DES CHIFFRES");
		System.out.println("1. Semer une Graine");
		System.out.println("2. Recolter plante mature");	
		System.out.println("3. Passer à la saison suivante");	
		System.out.println("4. Quitter Application");
		int resultat = choix.nextInt();
		switch(resultat) {
		case 1:
			J1.semer();
			break;
		case 2:
			J1.recolter();
			break;
		case 3:
			J1.saisonSuivante();
			break;
		case 4:
			System.out.println("Fermeture du Jardin..");
			break;
		}
	}
}
