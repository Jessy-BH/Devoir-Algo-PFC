package devoiralgopfc;

import java.util.Random;
import java.util.Scanner;

public class DevoirAlgoPFC  {

	public static void main(String[] args) {
		
		Random random = new Random();
		int scoreJoueur = 0;
		int scorePnj = 0;
		
		// Boucle tant que personne n'a 3 en score le jeu se répète		
		while (scoreJoueur != 3 && scorePnj != 3) {
			switch (resultat(choixJoueur(), random.nextInt(3)+1)){
			case 1 : 
				scoreJoueur++; // Ajoute un point au joueur s'il gagne un tour
				break;
			case 2 :
				scorePnj++; // Ajoute un point au PNJ s'il gagne un tour
				break;
			}
			System.out.println("Votre score : " + scoreJoueur + " " + "Score PNJ : " + scorePnj + "\n");
		}
		
	}

	// Selection de l'objet joué par le joueur
	public static int choixJoueur() {
		
		Scanner sc = new Scanner(System.in);
		
		int choix;
		
		do {
			// Le joueur choisit entre pierre feuille et ciseaux
			System.out.println("1 pour Pierre, 2 pour Feuille, 3 pour Ciseaux");
			System.out.println("Choisir");
			choix = sc.nextInt(); 
			
		
		} while (choix > 3 || choix < 1); // Si le joueur entre un chiffre plus petit que 1 ou plus grand que 3 la boucle se relance
		
		if (choix == 1) {
			System.out.println("Vous avez choisi pierre");
		}else if (choix == 2) {
			System.out.println("Vous avez choisi feuille");
		}else {
			System.out.println("Vous avez choisi ciseaux");
		}
			return choix;	
			
	}

	// On vérifie qui est le vainqueur du tour
	public static int resultat (int choixJoueur, int choixPnj) {
		
		int resultat;
		
		if (choixJoueur == 1 && choixPnj == 3 || choixJoueur == 2 && choixPnj == 1 || choixJoueur == 3 && choixPnj == 2) {
			System.out.println("Vous avez gagné !");
			resultat = 1;	
		}else if (choixJoueur == choixPnj) {
			System.out.println("Égalité, il n'y a pas de vainqueur.");
			resultat = 0;
		}else {
			System.out.println("Vous avez perdu.");
			resultat = 2;
		}
		return resultat;
	}
}
