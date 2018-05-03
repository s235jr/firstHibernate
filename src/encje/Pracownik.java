package encje;

import java.util.Set;

public class Pracownik {
    private int idPracownika;
    private String imie;
    private String nazwisko;
    private Stanowisko stanowisko;
    private Set<Narzedzia> narzedzia;
    private Adres adres;

    public int getIdPracownika() {
        return idPracownika;
    }

    public void setIdPracownika(int idPracownika) {
        this.idPracownika = idPracownika;
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

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    public Set<Narzedzia> getNarzedzia() {
        return narzedzia;
    }

    public void setNarzedzia(Set<Narzedzia> narzedzia) {
        this.narzedzia = narzedzia;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}