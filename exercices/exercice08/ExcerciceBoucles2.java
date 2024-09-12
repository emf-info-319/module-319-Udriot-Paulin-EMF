public class ExcerciceBoucles2 {
    public static void main(String[] args) {
        int i;
        System.out.println("Boucle for:");
        for (i=5; i > 0; i--){
          System.out.println(i);

        }  
        System.out.println("Décollage !!");
        i = 6;
        System.out.println("Boucle while:");
        while (i > 1) {
            i--;
            System.out.println(i);
        }
        System.out.println("Décollage !!");
        
        i = 6;
        System.out.println("Boucle do-while:");
        do { i--; 
            System.out.println(i);
        }while (i>1);
        System.out.println("Décollage !!");
      }

}
