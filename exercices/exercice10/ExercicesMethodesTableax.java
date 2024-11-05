package exercice10;

public class ExercicesMethodesTableax {
    public static void main(String[] args) {
        int taille = 5;

        int[] tab = créétab(taille);
        int[] tab1 = remplissagetab(tab);
        for (int i = 0; i < tab1.length; i++) {
        System.out.println(tab1[i]);
        }
        
    }
    public static int[] créétab(int taille){
        int[] tab = new int[taille];
        return tab;
    }
    public static int[] remplissagetab(int[] tab){
        for (int i = 0; i < tab.length; i++) {
        tab[i] = (int)(Math.random() * (100 - 1 + 1))+1;
        }
        return tab;
    }


}
