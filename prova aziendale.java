import java.util.Scanner;

public class prova aziendale {}

    public static void main(String args[]) 
    {
        //DICHIARAZIONE
        int punteggio;
        String nome;
        Scanner input = new Scanner(System.in);

        //INPUT
        System.out.println("inserisci il punteggio");
        punteggio = input.nextInt();


        //SVOLGIMENTO
        if(punteggio < 500 && punteggio > 0)
            System.out.println("Ritenta!");

        else if(punteggio > 500 && punteggio < 900)
            System.out.println("Buono!");
        
        else if(punteggio > 900){
            
            Scanner input2 = new Scanner(System.in);
            System.out.println("inserisci il nome");
            nome = input2.nextLine();
            
            System.out.println(" +--+");
            System.out.println("|"+nome+"|");
            System.out.println(" +--+");
        } 
        
        else
            System.out.println("punteggio non valido");
    }
    
}
