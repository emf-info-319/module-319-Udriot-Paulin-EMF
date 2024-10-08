package devoir03;

public class devoir03 {
    public static void main(String[] args) {
        int annee = 2024;
        int mois = 12;
        int jours = 31;
        int joursDeLan = 0;

        // Calcul du jour de l'année
        int[] JoursParMois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // année bissextile
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            JoursParMois[1] = 29;
        }
        // calcul du jours de l'an
        for (int i = 0; i < mois - 1; i++) {
            // JoursDeLan -= i;
            joursDeLan += JoursParMois[i];
        }

            joursDeLan += jours;
        System.out.println("Le " + jours + "/" + mois + "/" + annee + " est le jour " + joursDeLan + " de l'An.");

    }
}