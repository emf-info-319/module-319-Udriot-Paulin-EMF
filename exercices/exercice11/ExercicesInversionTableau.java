package exercice11;

public class ExercicesInversionTableau {
    public final static int MAX = 100;
    public final static int MIN = 0;

    public static void main(String[] args) {
        System.out.println("Contenu du tableau initial :");
        int[] tableauInitial = new int[4];
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("tableau initial [0] = " + tableauInitial[i]);
        }
        int[] tableauFinal = inversionLeTableau(tableauInitial);

        System.out.println();
        System.out.println("Contenu du tableau final :");
        for (int j = 0; j < tableauFinal.length; j++) {
            System.out.println("tableau initial [0] = " + tableauFinal[j]);    
        }
       
    }

    public static int[] inversionLeTableau(int[] tab1) {
        int[] tab2 = new int[tab1.length];
        int a = 1;
        for (int i = 0; i < tab1.length; i++) {
            tab2[i] = tab1[tab1.length - a];
            a++;
        }
        return tab2;
    }

}
