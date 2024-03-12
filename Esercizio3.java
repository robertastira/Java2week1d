import java.util.HashMap;
import java.util.Map;

public class Esercizio3 {
    private static final Map<String, String> rubrica = new HashMap<>();
    public static void main(String[] args) {
        aggiungiContatto("Roberta Stira", "3421824731");
        aggiungiContatto("Giovanni Rossi","3765435232");
        aggiungiContatto("Stefano Rossi", "3556787624");
        aggiungiContatto("Luca Bianchi", "36787624212");
        System.out.println("Contatti Inseriti: " + rubrica.size());


        rimuoviContatto("Luca Bianchi");
        System.out.println("Contatto cancellato");


        trovaNumero("3556787624");
        trovaNome("Giovanni Rossi");

        stampaTutto();






    }

    private static void stampaTutto() {
        for (String name : rubrica.keySet()) {
            System.out.println("Nome: " + name + ", Tel: " + rubrica.get(name));
        }
    }

    private static void trovaNome(String name) {
        String esitoRicerca = rubrica.get(name);
        System.out.println(esitoRicerca);
    }

    private static void trovaNumero(String telefono) {
        String result = "";
        for (String name : rubrica.keySet()) {
            if (telefono.equals(rubrica.get(name))) {
                result = name;
            }
        }
        System.out.println(result);

    }

    private static void rimuoviContatto(String name) {
        rubrica.remove(name);
    }

    private static void aggiungiContatto(String name, String telefono) {
        rubrica.put(name, telefono);
    }



}
