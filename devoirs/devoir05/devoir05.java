package devoir05;
import java.util.Scanner;

public class devoir05 {
    public static void main(String[] args) {
        int nbre = (int) (Math.random() * (100 - 0 + 1)) + 0;
        int supposition = 0;

        System.out.println("Bienvenue au jeu de devinette !");
        System.out.println("J'ai pensé à un nombre entre 1 et 100. Pouvez-vous le deviner ?");
        // On crée un scanner pour lire sur la ligne de commande les touches pressées
        Scanner scanner = new Scanner(System.in);
        // Voici comment lire un entier depuis la console
        while (supposition != nbre) {
            System.out.print("Entrez votre supposition : ");
            supposition = scanner.nextInt();

            if (supposition < nbre) {
                System.out.println("Trop petit !");
            } else if (supposition > nbre) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Bravo, trouvé !");
            }
        }

        scanner.close();
    }
}