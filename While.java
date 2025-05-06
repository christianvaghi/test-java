import java.util.Scanner;

public class While{

    public static void main(String[] args) {
        int variabile=0;

        Scanner input = new Scanner(System.in);

        variabile = input.nextInt();
        while(variabile<0)
        {
            variabile = input.nextInt();

        }
        
    }
}