
import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int media;

        Scanner input = new Scanner(System.in);
        System.out.println("inserisci il primo voto");
        a = input.nextInt();
        System.out.println("inserisci il secondo voto");
        b = input.nextInt();
        System.out.println("inserisci il terzo voto");
        c = input.nextInt();
        System.out.println("media voti");
        media = (a+b+c)/3;

System.out.println(media);

    }
}


