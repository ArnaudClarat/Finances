import DAO.FactureDAO;
import Models.Facture;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;
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
				System.out.println("\nTransactions du mois :");
				double total = 0;
				for (Facture facture: Objects.requireNonNull(FactureDAO.getMonth())) {
					total += facture.getTotal();
					System.out.println(facture);
				}
				System.out.println("\tTotal = " + new DecimalFormat("###.##").format(total) + "€");
			}
			
			if (choice.equals("2")) {
				System.out.println("\nTransactions de l'année :");
				double total = 0;
				for (Facture facture:Objects.requireNonNull(FactureDAO.getYear())) {
					total += facture.getTotal();
					System.out.println(facture);
				}
				System.out.println("\tTotal = " + new DecimalFormat("###.##").format(total) + "€");
			}
			
			if (choice.equals("3")) {
				System.out.println(
					"Voulez-vous chercher la transaction par" +
						"\n\t1 : Date" +
						"\n\t2 : ID"
				);
				String meth = scanner.nextLine();
				ArrayList<String> options = new ArrayList<>();
				options.add("1");
				options.add("2");
				while (!options.contains(meth)) {
					System.out.println("Nous n'avons pas compris " +
							"; veuillez réessayer");
					meth = scanner.nextLine();
				}
				System.out.println("Quelle transaction voulez vous voir? ");
				
				if (meth.equals("1")) {
					// Par date
				}
				
				if (meth.equals("2")) {
					// Par ID
				}
			}
			
			if (choice.equals("4")) {
				// TODO Faire menu modifications (MDP?)
				System.out.println("Menu de modification");
			}
			System.out.println("Nous n'avons pas compris ; veuillez réessayer");
		} while (!choice.equals("Q"));
	}
}
