package revisions;
import java.util.Scanner;

public class Udriot_E2 {
    public static final int NOMBRE_BATONNETS = 21;
    public static final int MIN = 1;
    public static final int MAX = 3;

    public static void main(String[] args) {
        int[] batonnets = new int[NOMBRE_BATONNETS];
        boolean tourJoueur = true;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < batonnets.length; i++) {
            batonnets[i] = 1;
        }
         System.out.println("Bienvenue dans le jeu de Nim");
         System.out.println("Vous et l’IA retirez tour à tour entre 1 et 3 bâtonnets.");
         System.out.println("Le joueur qui retire le dernier bâtonnet perd");
         while (nbBatonnetRestants(batonnets)>0) {
            if (nbBatonnetRestants(batonnets)>0) {
                afficherBatonnets(batonnets);
                tourJoueur = !tourJoueur;

                if (tourJoueur == true) {
                    int nbEnleve = demanderNombre(scanner);
                    batonnets = enleverBatonnets(batonnets, nbEnleve);
                }
                else {
                    int nbEnleveIA = (int)(Math.random() * (MAX - MIN + 1))+MIN;
                    System.out.println("L'IA veut elever " + nbEnleveIA);
                    batonnets = enleverBatonnets(batonnets, nbEnleveIA);


                }
                }
         }
         scanner.close();
    }
    

    //afiche les baton    
    public static void afficherBatonnets(int[] batonnets) {
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                System.out.print("|");
            } 
            else {
                System.out.print("-");
            }
        }
        System.out.println("");
    }
    //pour enlever des baton
    public static int[] enleverBatonnets(int[]batonnets,int nbEnleve){
        int nbRestants = nbBatonnetRestants(batonnets);
        int nbEnleveMax;
        if (nbRestants > nbEnleve) {
            nbEnleveMax = nbEnleve; 
        }
        else{
            nbEnleveMax = nbRestants;
        }
       
        for (int i = batonnets.length-1; i >= 0 && nbEnleveMax < 0; i--) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0;
                nbEnleveMax--;
            }
        }
        return batonnets;
    }
    

    //ce qui rest
    public static int nbBatonnetRestants(int[]batonnets) {
        int compteur = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                compteur++;
            }
        }
        return compteur;

    }
    public static int demanderNombre(Scanner scanner){
         scanner = new Scanner(System.in);
        // Lecture d'un entier
        System.out.print("Entrez un nombre entre 1 et 3 : ");
        int nbr = scanner.nextInt();
        while (nbr < 1 || nbr > 3) {
            System.out.println("le nombre est incorect entré un nouveau nombre entre 1 et 3 svp");
            nbr = scanner.nextInt();
        }

        // Consommation de la ligne vide après l'entier
        scanner.nextLine();

        
        return nbr;
    }
    

}
