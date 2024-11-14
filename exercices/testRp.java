public class testRp {
    public static void main(String[] args) {
        int []tab = new int[] {1,2,3,4,5,6,7,8,9};
        valeurMinimale(tab);
        System.out.println(valeurMinimale(tab));
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
}
