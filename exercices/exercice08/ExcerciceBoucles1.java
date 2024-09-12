public class ExcerciceBoucles1 {
    public static void main(String[] args) {
        String boucles = "Boucle for, itération ";
        int i;
        for (i = 1; i < 6; i++) {
            System.out.println(boucles +i);

        }
        i = 0;
        while (i < 5) {
            i++;
            System.out.println("Boucle while, itération " + i);
        }
        i = 0;
        do { i++; 
            System.out.println("Boucle do-while, itération " + i);
        }while (i<5);

       
        for (i = 1; i < 6; i++) {
            System.out.println(boucles +i);
            if (i == 3) {
                continue;
            }
          }
          i = 0;
        while (i < 3) {
              i++;
              System.out.println("Boucle while, itération " + i);
          }
         

    }
    
}