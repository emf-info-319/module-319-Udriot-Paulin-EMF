package IntroMethode;

import java.util.Scanner;

public class test {
    

    public static void main(String[] args) {
        // Création de l'objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Lecture d'un entier
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        // Consommation de la ligne vide après l'entier
        scanner.nextLine();

        // Lecture d'une chaîne de caractères
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        // Affichage des informations saisies
        System.out.println("Nom : " + nom + ", Âge : " + age);

        // Fermeture du scanner
        scanner.close();
    }

}
