public class Example {
    public final static int NOTE_MIN = 1;
    public final static int NOTE_MAX = 6;
    public final static int NBRE_NOTES = 5;

    public static void main(String[] args) {
        int max = NOTE_MAX;
        int min = NOTE_MIN;
        int[] notesObtenues = new int[NBRE_NOTES];
        String text;
        double totalNote = 0;
        
        for (int i = 0; i < notesObtenues.length; i++) {
            notesObtenues[i] = (int) (Math.random() * ((max-1) + min)) + min;
            totalNote += notesObtenues[i];
            if (notesObtenues[i]==4) {
                text = " : suffisant";
            }
            else if (notesObtenues[i]==5) {
                text = " : bien";
            }
            else if (notesObtenues[i]==6) {
                text = " : très bien";
            }
            else {
                text = " : insuffisant";
            }
            System.out.println("La note obtenue est " + notesObtenues[i] + text);
        }
        double moyenne = totalNote / notesObtenues.length;
        System.out.println("La moyenne est de : " + moyenne);
        if (moyenne >=4 ) {
            System.out.println("L'élève est promu !");
        }
        else {
            System.out.println("L'élève est non promu !");
        }

        

    }

}

