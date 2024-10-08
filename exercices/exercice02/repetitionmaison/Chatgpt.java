package exercices.exercice02.repetitionmaison;

public class Chatgpt {
    public final static int = 3;
    static public void main (String [] args){
        int max = 100;
        int min = 0;
        int somme = 0;
        int [] tab = new int [5];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int)(Math.random() * (max - min))+min;
            System.out.println(tab[i]);
            somme += tab[i];
            
        }    
        double moyenne = (somme / tab.length);
        System.out.println(somme);
        System.out.println(moyenne);
        if (moyenne>=50) {
            System.out.println("Il a reussi");
        }
        else{
            System.out.println("Il n'a pas reussi");
        }
        System.out.println("La moyenne des notes est " + moyenne);
    }
}