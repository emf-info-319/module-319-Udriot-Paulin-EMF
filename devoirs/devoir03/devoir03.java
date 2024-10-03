package devoir03;
public class devoir03 {
    public static void main(String[] args) {
        int jour = 21;
        int mois = 2;
        int annee = 2024;
        int[] tab;
        tab =  new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (annee % 4 == 0) {
            tab[1] = tab [1] + 1;
        }  
        int nombreJourTotal = jour;
        for (int i = 0; i < mois - 1; i++){
            //nombreJourTotal = nombreJourTotal + tab[i];
            nombreJourTotal += tab[i];
            
        }
        System.out.println("le " + jour + "/" + mois + "/" + annee + " est le jour " +nombreJourTotal + " de l'An.");

    }

}