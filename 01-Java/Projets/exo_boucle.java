package fr.formation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exo_boucle {
	public static void main(String[] args) {
		int nmb = 0;
		int total = 0;
		int moy_mont = 0;
		int nmb_inf_200 = 0;
		int tot_inf_200 = 0;
		int nmb_sup_200 = 0;
		int tot_sup_200 = 0;
		int num_cheque = 1;
		int num_cheque_min = 0;
		int num_cheque_max = 0;
		int montant = 1;
		int min = 999999999;
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
	 
		while(num_cheque != 0){
			try {
				System.out.println("veuillez entrer le numeros du cheque");
				num_cheque = sc.nextInt();
				
				System.out.println("veuillez entrer le montant du cheque");
				montant = sc.nextInt();
				
				nmb++;
				total += montant;
				if(montant < 200 && montant > 0) {
					nmb_inf_200++;
					tot_inf_200 += montant;
				}
				else{
					nmb_sup_200++;
					tot_sup_200 += montant;
				}
				if(montant < min && montant > 0) {
					min = montant;
					num_cheque_min = num_cheque;
				}
				if(montant > max) {
					max = montant;
					num_cheque_max = num_cheque;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("vous devez entrez un entier");
			}
		}
		if(total != 0) {			
			moy_mont = total / nmb ;
		}
		if(min == 999999999) {
			min = 0;
		}
		System.out.println("vous avez entrer " + nmb + " checque");
		System.out.println("pour un montant de " + total + "€");
		System.out.println("avec une moyenne de " + moy_mont + "€ par cheque");
		System.out.println(nmb_inf_200+" cheque etait en dessou de 200€");
		System.out.println("pour un total de "+ tot_inf_200 + "€");
		System.out.println(nmb_sup_200+" cheque etait au dessus ou egal a 200€");
		System.out.println("pour un total de "+ tot_sup_200 + "€");
		
		System.out.println("le cheque le plus petit comportait le numero " + num_cheque_min + " pour un montant de " + min);
		System.out.println("le cheque le plus grand comportait le numero " + num_cheque_max + " pour un montant de " + max);
	}
}
