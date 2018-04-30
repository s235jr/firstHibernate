package encje;

public class Pracownik {
    private int ID;
    private String Imie;
    private String Nazwisko;
    private int Stawka;
    private int Ilosc_godzin;
    private int Wynagrodzenie;
    private int idstanowiska;
    private Stanowisko Stanowisko;

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

    public Stanowisko getStanowisko() {
        return Stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        Stanowisko = stanowisko;
    }

    public int getIdstanowiska() {
        return idstanowiska;
    }

    public void setIdstanowiska(int idstanowiska) {
        this.idstanowiska = idstanowiska;
    }
}