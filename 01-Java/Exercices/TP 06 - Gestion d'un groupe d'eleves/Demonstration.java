package fr.formation.groupeeleves.demonstration;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import fr.formation.groupeeleves.model.Classe;
import fr.formation.groupeeleves.exception.ClasseException;
import fr.formation.groupeeleves.model.Eleve;
import fr.formation.groupeeleves.model.Instituteur;
import fr.formation.groupeeleves.model.Parent;

public class Demonstration {

	
	private static Classe classeVerte;
	private static Classe classeRouge;
	
	/**
	 * Création des éléves, parents (référents), instituteurs et classes. Mise en relation des classes
	 */
	public static void creerTout() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// Création des personnes et de leurs liens
		Instituteur i1 = new Instituteur("Tanguy", "Marcel", "2 rue des charmilles, 44000 Nantes",
				sdf.parse("28/05/1973"));
		Instituteur i2 = new Instituteur("Michot", "Julie", "12 rue du pont, 35000 Rennes", sdf.parse("02/05/1988"));

		Parent p1 = new Parent("Duchemin", "Remi", "31 impasse Bacot 35000 Rennes", sdf.parse("24/02/1992"));
		Parent p2 = new Parent("Lamartine", "Simona", "18 rue du Lys, 44000 Nantes", sdf.parse("12/12/1990"));
		Parent p3 = new Parent("Marchand", "Remi", "3 rue du Loup 35000 Rennes", sdf.parse("20/12/1988"));
		Parent p4 = new Parent("Durant", "Emmanuel", "6 rue Michot 44200 Nantes", sdf.parse("01/01/1991"));
		Parent p5 = new Parent("Amiral", "Micheline", "18 rue des tulipes 35000 Rennes", sdf.parse("24/12/1979"));
		Parent p6 = new Parent("Mariot", "Rachida", "31 impasse Bacot 35000 Rennes", sdf.parse("24/05/1999"));

		Eleve e1 = new Eleve("Duchemin", "Louis", "31 impasse Bacot 35000 Rennes", sdf.parse("20/05/2010"));
		e1.setReferent(p1);
		Eleve e2 = new Eleve("Duchemin", "Marie", "31 impasse Bacot 35000 Rennes", sdf.parse("21/06/2012"));
		e2.setReferent(p1);
		Eleve e3 = new Eleve("Duchemin", "Lucas", "31 impasse Bacot 35000 Rennes", sdf.parse("01/07/2009"));
		e3.setReferent(p1);

		Eleve e4 = new Eleve("Lamartine", "Emie", "18 rue du Lys, 44000 Nantes", sdf.parse("12/12/2010"));
		e4.setReferent(p2);

		Eleve e5 = new Eleve("Marchand", "Tom", "3 rue du Loup 35000 Rennes", sdf.parse("20/12/2010"));
		e5.setReferent(p3);
		Eleve e6 = new Eleve("Marchand", "Leo", "3 rue du Loup 35000 Rennes", sdf.parse("21/01/2011"));
		e6.setReferent(p3);
		Eleve e7 = new Eleve("Marchand", "Simon", "3 rue du Loup 35000 Rennes", sdf.parse("01/03/2012"));
		e7.setReferent(p3);

		Eleve e8 = new Eleve("Durant", "Pierre", "6 rue Michot 44200 Nantes", sdf.parse("01/07/2011"));
		e8.setReferent(p4);

		Eleve e9 = new Eleve("Amiral", "Sidonie", "18 rue des tulipes 35000 Rennes", sdf.parse("04/12/2008"));
		e9.setReferent(p5);
		Eleve e10 = new Eleve("Amiral", "Marius", "18 rue des tulipes 35000 Rennes", sdf.parse("12/03/2009"));
		e10.setReferent(p5);
		Eleve e11 = new Eleve("Amiral", "Antoine", "18 rue des tulipes 35000 Rennes", sdf.parse("25/10/2010"));
		e11.setReferent(p5);
		Eleve e12 = new Eleve("Amiral", "Marie", "18 rue des tulipes 35000 Rennes", sdf.parse("25/10/2010"));
		e12.setReferent(p5);
		Eleve e13 = new Eleve("Amiral", "Eloise", "18 rue des tulipes 35000 Rennes", sdf.parse("10/12/2011"));
		e13.setReferent(p5);

		Eleve e14 = new Eleve("Mariot", "Emilie", "31 impasse Bacot 35000 Rennes", sdf.parse("24/06/2010"));
		e14.setReferent(p6);
		Eleve e15 = new Eleve("Mariot", "Amaury", "31 impasse Bacot 35000 Rennes", sdf.parse("20/07/2009"));
		e15.setReferent(p6);

		// attribution des classes
		classeVerte = new Classe("Classe Verte");
		classeVerte.setInstituteur(i1);
		classeVerte.addEleve(e1);
		classeVerte.addEleve(e2);
		classeVerte.addEleve(e3);
		classeVerte.addEleve(e4);
		classeVerte.addEleve(e5);
		classeVerte.addEleve(e6);
		classeVerte.addEleve(e7);
		classeVerte.addEleve(e8);

		classeRouge = new Classe("Classe Rouge");
		classeRouge.setInstituteur(i2);
		classeRouge.addEleve(e9);
		classeRouge.addEleve(e10);
		classeRouge.addEleve(e11);
		classeRouge.addEleve(e12);
		classeRouge.addEleve(e13);
		classeRouge.addEleve(e14);
		classeRouge.addEleve(e15);
	}

	/**
	 * Affichage de l'état des classes
	 */
	public static void etatDesClasses() {
		System.out.println();
		System.out.println(classeRouge);
		System.out.println();
		System.out.println(classeVerte);
	}
	
	/**
	 * Tri des éléves de chaque classe par leurs prénom  dans l'ordre croissant
	 */
	public static void trierLesClasses() {
		System.out.println("TRI DES ELEVES PAR PRENOMS");
		classeRouge.sortListEleve();
		classeVerte.sortListEleve();
	}

	/**
	 * Affichage des parents de la classe Rouge
	 */
	public static void affichageDesParentsClasseRouge() {
		System.out.println("PARENTS DE LA CLASSE ROUGE");
		for(Parent p : classeRouge.getListParent()) {
			System.out.println(p.getPrenom()+ " " +p.getNom() );
		}	
	}
	
	/**
	 * Départ d'un éléve en le recherchant dans les éléves de la classe et le supprimant de la classe
	 */
	public static void departDUnEleve() {
		System.out.println();
		System.out.println("DEPART DE Marie Duchemin de la classe verte");
		Eleve e;
		try {
			e = classeVerte.getEleve(2);
			classeVerte.removeEleve(e);
			System.out.println();
			System.out.println(classeVerte);	
		} catch (ClasseException ex) {
			System.err.println(ex.getMessage());
		}
	}

	/**
	 * Récupération d'un éléve avec un index trop grand. Ceci provoque une exception qui doit étre gérée
	 */
	public static void recuperationEleveInconnu() {
		System.out.println();
		System.out.println("RECUPERATION DE L'ELEVE D'INDEX 200 déclenchant une exception");
		try {
			Eleve inconnu = classeVerte.getEleve(200);
			System.out.println(inconnu.getPrenom() + " " + inconnu.getNom());
		} catch (ClasseException ex) {
			System.err.println(ex.getMessage());
		}
	}
	
	/**
	 * 
	 * PROGRAMME PRINCIPAL TESTANT NOTRE STRUCTURE OBJET 
	 */
	public static void main(String[] args) throws ParseException {
		creerTout();
		
		etatDesClasses();
		
		trierLesClasses();

		etatDesClasses();
	
		affichageDesParentsClasseRouge();

		departDUnEleve();
			
		recuperationEleveInconnu();
	}

}
