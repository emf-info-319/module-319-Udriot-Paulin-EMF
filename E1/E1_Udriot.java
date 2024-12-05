package E1;

import java.util.Scanner;

public class E1_Udriot {
    public final static int DES_MIN = 1;
    public final static int DES_MAX = 6;
    public final static int NOMBRE_TUILES = 12;
    public static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tuiles = new int[NOMBRE_TUILES];
        boolean enJeu = true;
        System.out.println("**********************************");
        System.out.println("*         'Shut The Box'         *");
        System.out.println("**********************************");
        System.out.println("Il faut baisser les tuiles pour avoir un total équivalent au total de la sommes des dés.Le 0 ");
        System.out.println("permet de terminer la partie.");
        for (int i = 0; i < tuiles.length; i++) {
            tuiles[i] = i + 1;
        }
        while (enJeu == true) {
            afficheTuiles(tuiles);
            int totalDes = tireLesDes();
            System.out.println("Donnez le(s) nombre(s) à enlever :");
            tuiles = enleveTuiles(tuiles, totalDes);
            boolean encore = contientEncoreDesTuilesABaisser(tuiles);
            if (encore == false) {
                System.out.println(" Jeu terminé");
                SCANNER.close();
                enJeu = false;
            }
        }
    }

    public static void afficheTuiles(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                System.out.print("__");
            }
            else if (i == tab.length) {
                if (tab[i] > 9) {
                    System.out.print("|" + tab[i] + "|");
                } else {
                    System.out.print("|0" + tab[i] + "|");
                }
            } else {
                if (tab[i] > 9) {
                    System.out.print("|" + tab[i] + "|");
                } else {
                    System.out.print("|0" + tab[i]);
                }
            }
        }

    }

    public static int tireLesDes() {
        int nbr1 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int nbr2 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int total = nbr1 + nbr2;
        System.out.println(" Les nombres tirés sont : " + nbr1 + " et " + nbr2 + " qui font un total de " + total);
        return total;
    }

    public static int[] enleveTuiles(int[] tuiles, int totalDes) {
        int[] tuilesTemp = copieTableau(tuiles);
        int totalEnleve = 0;
        boolean demandeEncore = true;
        do {
            int valeur = SCANNER.nextInt();
            totalEnleve = valeur + totalEnleve;
            if (valeur == 0) {
                System.out.println("Abandon");
                for (int i = 0; i < tuilesTemp.length; i++) {
                    tuilesTemp[i] = 0;
                }
                demandeEncore = false;
                return copieTableau(tuilesTemp);

            } else if (valeur < 1 || valeur > tuilesTemp.length) {
                System.out.println("Hors limites !");
                totalEnleve = 0;
            } else if (tuilesTemp[valeur - 1] == 0) {
                System.out.println("Vous avez déjà baissé la tuile à la position " + valeur);
                totalEnleve = valeur - totalEnleve;
            } else {
                if (totalEnleve < totalDes) {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println("« Ce n'est pas suffisant, merci d'enlever encore");
                } else if (totalEnleve > totalDes) {
                    System.out.println("« Le total est dépassez, choisissez d'autres nombres");
                    tuilesTemp = copieTableau(tuiles);
                    totalEnleve = 0;
                    afficheTuiles(tuiles);
                } else {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println(" Parfait !");
                    tuiles = copieTableau(tuilesTemp);
                    demandeEncore = false;
                }

            }

        } while (demandeEncore == true);
        return tuiles;
    }

    public static int[] copieTableau(int[] tab) {
        int[] copie = new int[tab.length];
        for (int i = 0; i < copie.length; i++) {
            copie[i] = tab[i];
        }
        return copie;
    }

    public static boolean contientEncoreDesTuilesABaisser(int[] tab) {
        int compteur = 0;
        boolean resultat =true;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                compteur++;
            }
            if (compteur == 0) {
                resultat = false;
            }
            else {
                resultat = true;
            }

        }
        return resultat;

    }
}