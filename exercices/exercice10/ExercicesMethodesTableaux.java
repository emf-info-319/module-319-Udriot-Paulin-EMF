import java.util.Random;

public class ExercicesMethodesTableaux {
    

    // Méthode pour créer un tableau de taille donnée
    public static int[] creerTableau(int taille) {
        return new int[taille];
    }

    // Méthode pour remplir un tableau avec une valeur fixe
    public static int[] remplirAvecValeurFixe(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeur;
        }
        return tableau;
    }

    // Méthode pour remplir un tableau avec des valeurs aléatoires
    public static int[] remplirAvecValeursAleatoires(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int)(Math.random() * (100 - 0 + 1)) + 0;
        }
        return tableau;
    }

    // Méthode pour obtenir la taille d'un tableau
    public static int tailleTableau(int[] tableau) {
        return tableau.length;
    }

    // Méthode pour afficher le contenu d'un tableau
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab[" + i + "]=" + tableau[i]);
        }
    }

    // Méthode pour trouver la valeur minimale dans un tableau
    public static int valeurMinimale(int[] tableau) {
        int min = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
          if (min > tableau[i]) {
            min = tableau[i];
          }
        }
        return min;
    }

    // Méthode pour trouver la valeur maximale dans un tableau
    public static int valeurMaximale(int[] tableau) {
        int max = tableau[0];
        for (int valeur : tableau) {
            if (valeur > max) max = valeur;
        }
        return max;
    }

    // Méthode pour compter la fréquence d'une valeur dans un tableau
    public static int compterFrequence(int[] tableau, int valeur) {
        int count = 0;
        for (int i = 0; i < tableau.length ; i++) {
            if (i == valeur) count++;
        }
        return count;
    }

    // Méthode pour calculer la somme des valeurs du tableau
    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }

    // Méthode pour calculer la moyenne des valeurs du tableau
    public static double moyenneTableau(int[] tableau) {
        return (double) sommeTableau(tableau) / tableau.length;
    }

    // Méthode pour remplacer une valeur par une autre dans un tableau
    public static int[] remplacerValeur(int[] tableau, int ancienneValeur, int nouvelleValeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == ancienneValeur) {
                tableau[i] = nouvelleValeur;
            }
        }
        return tableau;
    }

    // Méthode pour trouver la première occurrence d'une valeur
    public static int premiereOccurrence(int[] tableau, int valeur) {
        int position = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur){
                position = i;
                break;
            }
        }
        return position;
    }

    // Méthode pour trouver la dernière occurrence d'une valeur
    public static int derniereOccurrence(int[] tableau, int valeur) {
        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeur) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Création d'un tableau de 50 éléments
        int[] tableau = creerTableau(50);
        System.out.println("Le tableau a une taille de " + tailleTableau(tableau) + " cellules.");

        // Remplir le tableau avec des valeurs aléatoires
        tableau = remplirAvecValeursAleatoires(tableau);

        // Afficher le contenu du tableau
        System.out.println("\nContenu du tableau aléatoire :");
        afficherTableau(tableau);

        // Afficher les valeurs minimum et maximum
        System.out.println("\nLa valeur min trouvée = " + valeurMinimale(tableau));
        System.out.println("La valeur max trouvée = " + valeurMaximale(tableau));

        // Remplacer la valeur 12 par 5 dans le tableau
        tableau = remplacerValeur(tableau, 12, 5);
        System.out.println("\nAprès remplacement de la valeur 12 par la valeur 5 voici le contenu du tableau :");
        afficherTableau(tableau);

        // Afficher la somme et la moyenne du tableau
        System.out.println("\nLa somme des cellules du tableau = " + sommeTableau(tableau));
        System.out.printf("La moyenne des cellules du tableau = %.2f\n", moyenneTableau(tableau));

        // Rechercher les occurrences de la valeur 13
        int premierePosition = premiereOccurrence(tableau, 13);
        int dernierePosition = derniereOccurrence(tableau, 13);
        System.out.println("\nLa valeur 13 a été trouvée à la 1ère position N°" + (premierePosition != -1 ? premierePosition : "Non trouvée"));
        System.out.println("La valeur 13 a été trouvée à la dernière position N°" + (dernierePosition != -1 ? dernierePosition : "Non trouvée"));
    }
}
