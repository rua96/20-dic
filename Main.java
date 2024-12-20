package ristorante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scansione = new Scanner(System.in);
    	int scelta,tipo;
    	double prezzo;
    	String nome;
        ArrayList<Piatti> arrPrimiPiatti = new ArrayList<>();
        ArrayList<Piatti> arrAntipasti = new ArrayList<>();
        ArrayList<Piatti> arrSecondiContorni = new ArrayList<>();
        ArrayList<Piatti> arrBevande = new ArrayList<>();
        ArrayList<Piatti> arrDessert = new ArrayList<>();
        
        boolean esegui = true;
    
        while (esegui) {
            System.out.println("\nMenu Ristorante");
            System.out.print("\nCosa desideri fare? ");
            System.out.println("\nInserire 1 per inserire un nuovo piatto");
            System.out.println("Inserire 2 per visualizzare i piatti");
            System.out.println("Inserire 3 per uscire.");
            
            scelta=scansione.nextInt();
            scansione.nextLine();
            
            switch (scelta) {
            case 1:
                System.out.println("Inserire i dati del piatto che si vuole aggiungere");
				System.out.println("Che tipo di piatto vuoi inserire?");
				System.out.println("Inserisci \n 1 per Antipasti,\n 2 per Primi Piatti,\n 3 per Secondi Piatti e Contorni,\n 4 per Bevande,\n 5 per Dessert.");
                tipo=scansione.nextInt();
                scansione.nextLine();
                System.out.println("nome :");
                nome=scansione.nextLine();
                System.out.println("prezzo :");
                prezzo=scansione.nextDouble();
                scansione.nextLine();
                
                if (tipo==1) {
                    arrAntipasti.add(new Antipasti(nome,prezzo));
                } else if (tipo==2) {
                    arrPrimiPiatti.add(new PrimiPiatti(nome,prezzo));
                } else if (tipo==3) {
                    arrSecondiContorni.add(new SecondiContorni(nome , prezzo));
                } else if (tipo==4) {
                    arrBevande.add(new Bevande(nome, prezzo));
                } else if (tipo==5) {
                	arrDessert.add(new Dessert(nome,prezzo));
                }
                 else {
                    System.out.println("Tipo di piatto non valido. Non aggiunto.");
                }
                break;
				
            case 2:
                System.out.println("Hai scelto: Visualizzare i piatti inseriti");
                System.out.println("Scegli il tipo di piatti da visualizzare:");
                System.out.println("1. Antipasti ");
                System.out.println("2. Primi Piatti ");
                System.out.println("3. Secondi Piatti e Contorni");
                System.out.println("4. Bevande");
                System.out.println("5. Dessert");
                System.out.println("6. Tutti i piatti");

                int scelta2 = scansione.nextInt(); 
                scansione.nextLine();
                switch (scelta2) {
                    case 1:
                        System.out.println("\nAntipasti :");
                        if (arrAntipasti.isEmpty()) {
                            System.out.println("Nessun antipasto presente.");
                        } else {
                        for (Piatti p : arrAntipasti) {
                            System.out.println(p.toString()); 
                        }
                        }
                        
                        break;
                    
                    case 2:
                        System.out.println("\nPrimi Piatti :");
                        if (arrPrimiPiatti.isEmpty()) {
                            System.out.println("Nessun primo piatto presente.");
                        } else {
                        for (Piatti p : arrPrimiPiatti) {
                            System.out.println(p.toString()); 
                        }
                        }
                        break;
        
                    case 3:
                        System.out.println("\nSecondi Piatti e Contorni :");
                        if (arrSecondiContorni.isEmpty()) {
                            System.out.println("Nessun secondo piatto o contorno presente.");
                        } else {
                        for (Piatti p : arrSecondiContorni) { 
                            System.out.println(p.toString()); 
                        }
                        }
                        break;

                    case 4:
                        System.out.println("\nBevande :");
                        if (arrBevande.isEmpty()) {
                            System.out.println("Nessuna bevanda presente.");
                        } else {
                        for (Piatti p : arrBevande) {
                            System.out.println(p.toString()); 
                        }
                        }
                        break;
                        
                    case 5:
                        System.out.println("\nDessert :");
                        if (arrDessert.isEmpty()) {
                            System.out.println("Nessun dessert presente.");
                        } else {
                        for (Piatti p : arrDessert) {
                            System.out.println(p.toString()); 
                        }
                        }
                        break;
                    
                    case 6:
                        System.out.println("\nTutti i piatti:");
                        System.out.println("\nAntipasti: ");
                        if (arrAntipasti.isEmpty()) {
                            System.out.println("Nessun antipasto presente.");
                        } else {
                        for (Piatti p : arrAntipasti) {
                            System.out.println(p.toString());
                        }
                        }
                        System.out.println("\nPrimi Piatti: ");
                        if (arrPrimiPiatti.isEmpty()) {
                            System.out.println("Nessun primo piatto presente.");
                        } else {
                        for (Piatti p : arrPrimiPiatti) {
                            System.out.println(p.toString());
                        }
                        }
                        System.out.println("\nSecondi Piatti e Contorni: ");
                        if (arrSecondiContorni.isEmpty()) {
                            System.out.println("Nessun secondo piatto o contorno presente.");
                        } else {
                        for (Piatti p : arrSecondiContorni) {
                            System.out.println(p.toString());
                        }
                        }
                        System.out.println("\nBevande: ");
                        if (arrBevande.isEmpty()) {
                            System.out.println("Nessuna bevanda presente.");
                        } else {
                        for (Piatti p : arrBevande) {
                            System.out.println(p.toString());
                        }
                        }
                        System.out.println("\nDessert: ");
                        if (arrDessert.isEmpty()) {
                            System.out.println("Nessun Dessert presente.");
                        } else {
                        for (Piatti p : arrDessert) {
                            System.out.println(p.toString());
                        }
                        }
                        break;
                }
                break;
            case 3:
                System.out.println("Uscita dal Menu!");
                esegui = false;
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
            }
        }
   scansione.close();
   }
}
          