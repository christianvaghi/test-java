
    {
        //FASE DICHIARATIVA - DICHIARIAMO LE VARIABILI NECESSARIO

        Scanner input = new Scanner(System.in);
        float num1=0, num2=0;
        float risultato=0;
        char operazione;

        //FASE DI INPUT

        System.out.println("inserisci il primo numero:");
        num1 = input.nextFloat();
        System.out.println("inserisci il secondo numero:");
        num2 = input.nextFloat();
        System.out.println("inserisci l'operazione (+, -, *, /)");
        operazione = input.next().charAt(0);

        //FASE DI SVOLGIMENTO

        switch(operazione)
        {
            case '+':
                risultato = num1+num2;
                break;
            case '-':
                risultato = num1-num2;
                break;
            case '*':
                risultato = num1*num2;
                break;
            case '/':
                //controllo che il secondo numero non sia uguale a 0
                if(num2==0){
                    System.out.println("Errore! non è possibile dividere un numero per 0");
                    System.exit(0);
                }
                else
                    risultato = num1/num2;
                break;
            //caso default se viene inserito un simbolo sconosciuto
            default:
                System.out.println("Operazione sconosciuta");
                System.exit(0);
        }

        //FASE DI OUTPUT

        System.out.println("il risultato è "+risultato);

    }
}