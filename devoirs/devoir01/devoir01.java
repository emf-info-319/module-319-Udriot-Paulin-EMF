package devoir01;

public class devoir01 {
    public final static byte majorite = 20;

    public static void main(String[] args) {
        int monAge = 15;
        boolean estMajeur;

        if (monAge > majorite) {
            estMajeur = true;
            System.out.println(estMajeur);

        } else {
            estMajeur = false;
            System.out.println(estMajeur);

        }
        System.out.println("Je m'appelle Paulin Udriot");
        System.out.println("Mon âge est de " + monAge);
        if (estMajeur) {
            System.out.println("Je suis majeur");

        } else {
            System.out.println("Je ne suis pas encore majeur");

        }
    }
}
