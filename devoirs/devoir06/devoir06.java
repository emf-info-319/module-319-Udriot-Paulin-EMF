package devoir06;
public class devoir06 {
    public final static int TAILLE_TABLEAU = 20;
    public final static int VALEUR_MIN = 0;
    public final static int VALEUR_MAX = 50;
    public final static int VALEUR_RECHERCHEE = 7;
    public static void main(String[] args) {
        int position = -1;
        int petit = 50;
        int grand = 50;
        int[] tab = new int[TAILLE_TABLEAU] ;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int)(Math.random() * (VALEUR_MAX - VALEUR_MIN + 1))+VALEUR_MIN; 
            System.out.println("Tabeleau"+ "[" + i + "]"+ " = " +"[" + tab[i] + "]");
            while (tab[i] < petit)  {
                petit = tab[i];

            }
            while (tab[i] > grand) {
                grand = tab[i];
            }
            if (tab[i] == 7) {
                position = i;
            }
        }
        System.out.println("La plus petite valeur trouvée est : " + petit);
        System.out.println("La plus grande valeur trouvée est : " + grand);
        System.out.println("Le nombre [7] est à la position [" + position + "] du tabelau");


    }
    
}