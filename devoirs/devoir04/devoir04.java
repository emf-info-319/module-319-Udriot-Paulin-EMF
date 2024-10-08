package devoir04;
public class devoir04 {
    public static void main(String[] args) {
        int year = 2023;
        int month = 2;
        int day = 39;

        System.out.println("La date entrée est le " +day+"."+month+"."+year);

        if (year > 9999 && year < 0) {
            System.out.println("L'année ["+year+"] est hors limites !");
        }

        if (month > 12 && month < 0) {
            System.out.println("le mois ["+month+"] est hors limites !");
        }
        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0){
            if (day > 28 && day < 0) {
                System.out.println("Le jour ["+day+"] est hors limites !");
            }
        }
    }

}
