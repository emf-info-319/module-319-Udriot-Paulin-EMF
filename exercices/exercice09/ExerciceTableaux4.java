public class ExerciceTableaux4 {
    public static void main(String[] args) {
        int[] tab1 = new int[5];
        int Max = 50;
        int Min = 0;
        int tour = -1;
        tab1[0] = ( int ) ( Math.random() * ( Max - Min + 1 ) ) + Min;
        System.out.println(tab1[0]);
        for(int i = 0; i <= 5; i++){
            tab1[i] = tab1[0] + i;
            tour++;
            System.out.println("Cellule " + i + " : " + tab1[tour]);
        }
    }
}
