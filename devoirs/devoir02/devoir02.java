package devoirs.devoir02;
public class devoir02 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    // 
    int CAPACITE_RESERVOIR_B = 5;
    public static void main(String[] args) {
        int reservoirA = CAPACITE_RESERVOIR_A;
        int reservoirB = 5;
        int remplissage;
        remplissage = ( int ) ( Math.random() * ( (reservoirB + reservoirA) - -1 + 0 ) ) + -1; // todo à corriger, il peut mettre -1 comme valeur
        // int nombre = ( int ) ( Math.random() * ( MAX - MIN + 1 ) ) + MIN;
        System.out.println(remplissage);
        int nombrearenplire;
        //nombrearenplire = remplissage - 8;
        //        1             2,5              4
        for (int tour = 0; tour < remplissage; tour++) {
            // 3,6
            //System.out.println("Remplissage du réservoir A...");
            System.out.println(tour);

            // si il y a de la place dans le réservervoir 3, 
            // sinon dans le réservervoir B
            // if ()
            // else
        }
        
            
        
    }
    
}
