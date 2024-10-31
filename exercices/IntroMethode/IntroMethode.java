package IntroMethode;

import java.util.Scanner;

public class IntroMethode {
    public static void main(String[] args) {
       debut();
        int nombre = demandeDeNombre();
        int nombre2 = demandeDeNombre();
        int nombre3 = demandeDeNombre();
        int resultat = somme(nombre , nombre2, nombre3);
        fin();
        
        System.out.println("la somme est : " + resultat);
        
    }
    public static int somme(int nb1, int nb2, int nb3){
        int somme = nb1 + nb2 + nb3;
        return somme;
    }
    public static void debut(){
        System.out.println("Bonjour et bienvenu sur ce permier programme.");
        System.out.println("On va voir les méthodes dans ce cours");
    }
    public static void fin(){
        System.out.println("programme terminé");
    }
    public static int demandeDeNombre(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre :");
        int nombre = scanner.nextInt();
        System.out.println("Merci, j'enregistre " + nombre);
        return nombre;
    }
}
