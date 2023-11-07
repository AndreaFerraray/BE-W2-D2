import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*ESERCIZIO 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il numero di parole da inserire:");
        int N = scanner.nextInt();

        scanner.nextLine();
        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("inserisci " + N + " parole");


        for (int i = 0; i < N; i++) {
            String parola =  null;;
            parola = scanner.nextLine();

        if (!paroleDistinte.add(parola)) {
            paroleDuplicate.add(parola);
        }  }
        scanner.close();
        System.out.println("Parole distinte: " + paroleDistinte);
        System.out.println("Parole duplicate: " + paroleDuplicate);

    }*/


        // ESERCIZIO 2
        Set<Integer> numeri = new HashSet<>();
        List<Integer> ListaCasuale = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci UN  numero da 0 a 100");
        int N = scanner.nextInt();
        if (N > 100) {
            throw new RuntimeException("il numero deve essere minore di 100");

        } else {
            numeri.add(N);
        }
        System.out.println(numeri);






/* **********************PROVA LETTURA STRINGA A NUMERI*************************
System.out.println("inserisci una lista di numeri da 0 a 100");
        String input = scanner.nextLine();
        String[] numeriSeparati = input.split(" ");
        for (String numeroStr : numeriSeparati) {
            int numero = Integer.parseInt(numeroStr);
            numeri.add(numero);
        }

        System.out.println("Lista di numeri inseriti: " + numeri);*/


        System.out.println("inserisci un  numero da 0 a 100");
        int Ns = scanner.nextInt();
        if (Ns > 100) {
            throw new RuntimeException("il numero deve essere minore di 100");


        } else {
            ListaCasuale.add(Ns);
        }
        System.out.println(ListaCasuale);


        int risposta = 0;
        while (risposta != 1) {
            System.out.println("0 inserisci un altro numero");
            System.out.println("1 chiudi applicazione");
            System.out.println("inserisci 2 per vedere la lista di numeri");
            risposta = scanner.nextInt();
            switch (risposta) {
                case 0: {

                    System.out.println("inserisci il prossimo numero");
                    int newNs = scanner.nextInt();
                    ListaCasuale.add(newNs);


                }


                case 1: {
                    System.out.println("applicazione chiusa");

                }
                break;
                case 2: {
                    System.out.println(ListaCasuale);

                }
                break;
                default: {
                    System.out.println("Scelta non valida");
                    break;
                }
            }

        }
    }}



