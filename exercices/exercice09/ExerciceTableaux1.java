package exercice09;

public class ExerciceTableaux1 {
    public static void main(String[] args) {
        int[] tab;//Déclaration du tableau
        tab = new int[5];
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        String[] tableau2;
        tableau2 = new String[5];
        for (int nombreDeCelule = 0; nombreDeCelule < tableau2.length; nombreDeCelule++) {
            System.out.println(tableau2[nombreDeCelule]);
        }

    }
}
