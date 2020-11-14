import java.awt.*;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		String choice;
		String menu = "";
		menu += "\n\tMenu :";
		menu += "\n\t\t1 = Afficher les transactions du mois";
		menu += "\n\t\t2 = Afficher les transactions de l'année";
		menu += "\n\t\t3 = Afficher une transaction en particulier";
		menu += "\n\t\t4 = Modifier données";
		menu += "\n\t\tQ = Quitter le programme";
		menu += "\n\n\tQue voulez vous faire? ";
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println(menu);
			choice = scanner.nextLine();
			if (choice.equals("1")) {
				// TODO Faire affichage transactions du mois
				System.out.println("Transactions du mois :");
			}
			if (choice.equals("2")) {
				// TODO Faire affichage transactions de l'année
				System.out.println("Transactions de l'année :");
			}
			if (choice.equals("3")) {
				// TODO Faire affichage transaction
				System.out.println("Quelle transaction voulez vous voir? ");
			}
			if (choice.equals("4")) {
				// TODO Faire menu modifications (MDP?)
				System.out.println("Menu de modification");
			}
		} while (!choice.equals("Q"));
	}
}
