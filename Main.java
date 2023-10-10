import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //ESERCIZIO 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il numero di parole da inserire:");
        int N = scanner.nextInt();
        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("inserisci " + N +" parole");
for( int i =0;i <N; i++){
    String parola = scanner.nextLine();
}
        if (!paroleDistinte.add(parola)) {
            paroleDuplicate.add(parola);
        }
        scanner.close();

    }
}
