package encje;

public class Stanowisko {
    private int idstanowiska;
    private String Stanowisko;
    private String Opis;
    private Pracownik pracownik;

    public int getIdstanowiska() {
        return idstanowiska;
    }

    public void setIdstanowiska(int idstanowiska) {
        this.idstanowiska = idstanowiska;
    }

    public String getStanowisko() {
        return Stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        Stanowisko = stanowisko;
    }

    public String getOpis() {
        return Opis;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

    public Pracownik getPracownik() {
        return pracownik;
    }

    public void setPracownik(Pracownik pracownik) {
        this.pracownik = pracownik;
    }
}
