import java.util.List;
import java.util.Scanner;
import java.util.*;


public class Esercizio2 {
    public static void main(String[] args) {
        System.out.println("Inserisci il numero di elementi: ");
        Scanner scanner = new Scanner(System.in);
        int numEl = scanner.nextInt();
        List<Integer> numeriRandom = creaListaRandom(numEl);
        stampaLista(numeriRandom);
        List<Integer> numeriRandom2 = creaListaInvertita(numeriRandom);
        stampaLista(numeriRandom2);





        pariODispari(numeriRandom2, false);
        pariODispari(numeriRandom2, true);

        scanner.close();

    }


    public static void pariODispari(List<Integer> lista, boolean even) {
        System.out.println("La lista è lunga: " + lista.size());
        String pariODispari = even ? "pari" : "dispari";
        System.out.println("Numeri in posizione " + pariODispari);
        int index = 0;
        for (Integer num : lista) {
            index++;
            if (even) {
                if (index % 2 == 0)
                    System.out.println("Posizione [" + index + "]: " + num);
            } else {
                if (index % 2 != 0)
                    System.out.println("Posizione [" + index + "]: " + num);
            }

        }
    }



    private static List<Integer> creaListaInvertita(List<Integer> lista) {
        List<Integer> numeriRandom2 = new ArrayList<>(lista);
        for (int i = lista.size() - 1; i >= 0; i--) {
            numeriRandom2.add(lista.get(i));
        }
        return numeriRandom2;

    }

    private static void stampaLista(List<Integer> lista) {
        System.out.println("Lunghezza lista: " + lista.size());
        int indice = 0;
        for (Integer num : lista) {
            System.out.println("Posizione [" + (indice++) + "]: " + num);

        }
    }

    private static List<Integer> creaListaRandom(int numEl) {
        List<Integer> lista1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numEl; i++) {
            lista1.add(random.nextInt(0, 101));
        }
        Collections.sort(lista1);
        return lista1;
    }


    }

