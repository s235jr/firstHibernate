package encje;

import java.util.Set;

public class Pracownik {
    private int ID;
    private String Imie;
    private String Nazwisko;
    private int Stawka;
    private int Ilosc_godzin;
    private int Wynagrodzenie;
    private int Stanowisko;
    private Set<Stanowisko> stanowisko;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public int getStawka() {
        return Stawka;
    }

    public void setStawka(int stawka) {
        Stawka = stawka;
    }

    public int getIlosc_godzin() {
        return Ilosc_godzin;
    }

    public void setIlosc_godzin(int ilosc_godzin) {
        Ilosc_godzin = ilosc_godzin;
    }

    public int getWynagrodzenie() {
        return Wynagrodzenie;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        Wynagrodzenie = wynagrodzenie;
    }

    public int getStanowisko() {
        return Stanowisko;
    }

    public void setStanowisko(int stanowisko) {
        Stanowisko = stanowisko;
    }

    public void setStanowisko(Set<encje.Stanowisko> stanowisko) {
        this.stanowisko = stanowisko;
    }
}
