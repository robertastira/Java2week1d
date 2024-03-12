import java.util.*;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parole = new HashSet<>();
        List<String> doppioni = new ArrayList<>();

        System.out.println("Inserisci il numero di elementi: ");
        int numEl = Integer.parseInt(scanner.nextLine());

        if (numEl > 0) {

            for (int i = 0; i < numEl; i++) {
                System.out.println("Inserisci una parola");
                String parola = scanner.nextLine();
                boolean added = parole.add(parola);
                if (!added) {
                    System.out.println(parola + " è un doppione");
                    doppioni.add(parola);
                }
            }


            System.out.println("Numero di parole totale: " + parole.size());
            System.out.println("Elenco delle parole: " + parole);
            System.out.println("Elenco dei doppioni: " + doppioni);
        } else {
            System.err.println("Zero non ammesso. Uscita dal ciclo.");
        }



    }
}
