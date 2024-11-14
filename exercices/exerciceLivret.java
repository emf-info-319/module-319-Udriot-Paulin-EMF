public class exerciceLivret {
    public static final int MIN = 5;
    public static final int MAX = 20;

    public static void main(String[] args) {
        int nbr1 = choisirUnNombre();
        int nbr2 = choisirUnNombre();
        System.out.println(nbr1 + " " + nbr2);
        System.out.println();
        String [] tab = construireTableMultiplication(nbr1, nbr2);
        for (int i = 0; i < tab.length; i++) {
          System.out.println(tab[i]);  
        }
    }

    public static int choisirUnNombre() {
        int nombre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        return nombre;
    }

    public static String[] construireTableMultiplication(int n1, int n2) {
        String[] tab = new String[n1 * n2];
        int i = 1;
        int a = 1;
        int conteur = 0;
        while (n2 != a-1) {
            tab[conteur] = (i + " * " + a + " = " + i * a);
            a++;
            conteur++;
            if (a -1 == n2 ) {
                a = 1;
                i++;
                if (i == n1 + 1) {
                    return tab;
                }
            }
        }

        return tab;
    }
}
