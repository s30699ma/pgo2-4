import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;

    public Klient(String imie,String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }

    public void setListaRezerwacji(ArrayList<Wydarzenie> listaRezerwacji) {
        this.listaRezerwacji = listaRezerwacji;
    }

    public void dodajRezerwację(Wydarzenie wydarzenie) {
        if (wydarzenie.zarezerwujMiejsce()) {
            listaRezerwacji.add(wydarzenie);
            System.out.println("Rezerwacja dodana: " + wydarzenie.getNazwa());
        }
    }
    public void anulujRezerwację(Wydarzenie wydarzenie) {
        if (listaRezerwacji.remove(wydarzenie)) {
            System.out.println("Anulowano rezerwację na: " + wydarzenie.getNazwa());
        }
    }
    public void wyświetlRezerwacje() {
        System.out.println("Rezerwacje klienta " + imie + " " + nazwisko + ":");
        for (Wydarzenie w : listaRezerwacji) {
            System.out.println("  - " + w);
        }
    }
}
