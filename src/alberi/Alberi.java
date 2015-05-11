package alberi;

public class Alberi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlberoBin vuoto = new AlberoBin();
        AlberoBin A = new AlberoBin(vuoto,"A", vuoto);
        AlberoBin B = new AlberoBin(vuoto, "B", vuoto);
        AlberoBin C = new AlberoBin(vuoto, "C", vuoto);
        AlberoBin D = new AlberoBin(vuoto, "D", vuoto);
        AlberoBin E = new AlberoBin(A, "E", B);
        AlberoBin F = new AlberoBin(C, "F", D);
        AlberoBin G = new AlberoBin(E, "G", F);
        AlberoBinario alb = G;
        System.out.println(alb);
        
    }
    
}
