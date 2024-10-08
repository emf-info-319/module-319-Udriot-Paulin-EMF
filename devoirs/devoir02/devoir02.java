package devoir02;
public class devoir02 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;
    public static void main(String[] args) {
        int reservoirA = CAPACITE_RESERVOIR_A;
        int reservoirB = CAPACITE_RESERVOIR_B;
        int remplissage;

        int MAX = reservoirB + reservoirA;
        int MIN = 0;

        remplissage = ( int ) ( Math.random() * ( MAX - MIN + 0 ) ) + MIN;
        System.out.println("Il y a " + remplissage + " litres à remplir.");
               
        for (int tour = 1; tour <= remplissage; tour++) {
            System.out.println("Remplissage du réservoir A...");
            System.out.println("Le réservoir A : " + tour + ", le réservoir B : 0");
           
            if (tour == 3) {
                break;
            }
        }
            
        int nombre = 1;
        for(int tour = 3; tour < remplissage; tour++) {
            System.out.println("Remplissage du réservoir B...");
            System.out.println("Le réservoir A : 3" + ", le réservoir B : " + nombre);
            nombre++;
        }


        // for (int tour = 1; tour <= remplissage; tour++) {
        //     // 3,6
        //     System.out.println("Remplissage du réservoir A...");
           
        //     if (tour <= 3) {
        //         System.out.println("Le réservoir A : " + tour + ", le réservoir B : 0");
        //     } else {
        //         System.out.println("Le réservoir A : 3" + ", le réservoir B : " + (tour - 3));
        //     }
        // }
    }
    
}
