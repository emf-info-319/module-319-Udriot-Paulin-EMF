public class ExerciceTableaux3 {
    public static void main(String[] args) {
        
        int[] tab1 = new int[10];
        int Max = 6;
        int Min = 1;
        int notcal = 0;
        
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * (Max - Min + 1)) + Min;
            System.out.println("Note " + i + ": " + tab1[i]);
            notcal += tab1 [i];
        }
        notcal /= tab1.length; 
        System.out.println(notcal);

    }
}
