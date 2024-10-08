package evalutation00;
public class UdriotE00 {
    public final static int NOMBRE_PTS_VICTOIRE = 3;
    public static void main(String[] args) {
        String nomEquipe1 = "Barcelone";
        String nomEquipe2 = "Madrid";
        int nombrePointEquipe1 = 0;
        int nombrePointEquipe2 = 0;
        int max = 10;
        int min = 0;
        for(int i = 0; i < 10; i++){
        int scoreEquipe1 = ( int ) ( Math.random() * ( max - min + 0 ) ) + min;
        int scoreEquipe2 = ( int ) ( Math.random() * ( max - min + 0 ) ) + min;
        System.out.println(nomEquipe1 +" joue contre" + nomEquipe2 + " et le résultat est : " + scoreEquipe1 + " à " + scoreEquipe2);
        if (scoreEquipe1 < scoreEquipe2) {
            System.out.println("Madrid a gagné");
            nombrePointEquipe1 += NOMBRE_PTS_VICTOIRE;
        }
        else if (scoreEquipe1 > scoreEquipe2) {
            System.out.println("Barcelone a gagné");
            nombrePointEquipe2 += NOMBRE_PTS_VICTOIRE;
        }
        else{
        System.out.println("Match nul !");
        nombrePointEquipe1++;
        nombrePointEquipe2++;
        }
        }
        System.out.println("Madrid a " + nomEquipe1 +" " + nombrePointEquipe1 + " points");
        System.out.println("Madrid a " + nomEquipe2 + " " + nombrePointEquipe2 + " points");
        
    }
}
