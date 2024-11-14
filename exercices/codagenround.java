public class codagenround {
    public final static double PI = 3.14;
    public static void main(String[] args) {
        int rayons[] = new int [10];
        int max = 100;
        int min = 0;
        for (int j = 0; j < rayons.length; j++) {
            rayons[j] = genreNombre(1, 10);
            if(rayons[j] > 50){
                System.out.println("Aire :" + PI*rayons[j]);          
            }
            else{
                System.out.println("");
            }
        }
        for (int i = rayons.length-1 ; i > 0 ; i--){
            System.out.println(rayons[i]);

        }

    }
    public static int genreNombre(int min, int max){
        int nombre = (int)(Math.random() * (max - min + 1))+min;
        return nombre;
    }
}
