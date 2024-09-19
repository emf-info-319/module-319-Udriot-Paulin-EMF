public class ExerciceTableaux3 {
    public static void main(String[] args) {
        int a = 0;
        int b;
        int[] tab1 = new int[10];
        int Max = 6;
        int Min = 1;
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * (Max - Min + 1)) + Min;
            System.out.println("Note " + i + ": " + tab1[i]);
            
        }
        for (int NumNote = 0; i < tab1.length; i++){
            NumNote = NumNote + tab1[i]
        }

    }
}
