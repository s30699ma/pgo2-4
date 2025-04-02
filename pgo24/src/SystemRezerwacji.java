
import java.util.ArrayList;
import java.util.List;
public class SystemRezerwacji {
    private List<Wydarzenie> wydarzenia = new ArrayList<>();
    private List<Klient> klienci = new ArrayList<>();


        public void dodajWydarzenie(Wydarzenie wydarzenie, String nazwa, double cena) {
            wydarzenia.add(wydarzenie);
        }
        public void dodajWydarzenie(Wydarzenie wydarzenie, String nazwa, String data, double cena){
            wydarzenia.add(wydarzenie);
        }

        public void dodajKlienta(Klient klient) {
            klienci.add(klient);
        }
        public void dodajKlienta(Klient klient, String email){
            klienci.add(klient);
        }
        public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
            klient.dodajRezerwację(wydarzenie);
        }
        public Wydarzenie znajdzWydarzenie(String nazwa) {
            for (Wydarzenie w : wydarzenia) {
                if (w.getNazwa().equalsIgnoreCase(nazwa)) {
                    return w;
                }
            }
            return null;
        }
        public Klient znajdzKlienta(String nazwisko) {
            for (Klient k : klienci) {
                if (k.getNazwisko().equalsIgnoreCase(nazwisko)) {
                    return k;
                }
            }
            return null;
        }
        public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
            Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
            if (wydarzenie != null) {
                wydarzenie.setCena(nowaCena);
                System.out.println("Cena wydarzenia '" + nazwa + "' została zmieniona na: " + nowaCena + " zł");
            } else {
                System.out.println("Nie znaleziono wydarzenia o nazwie: " + nazwa);
            }
        }

    public void dodajWydarzenie(Wydarzenie koncert) {
    }
}
