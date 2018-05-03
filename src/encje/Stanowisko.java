package encje;

import java.util.Set;

public class Stanowisko {
    private int idStanowiska;
    private String nazwa;
    private String opis;
    private Set<Pracownik> pracownik;

    public int getIdStanowiska() {
        return idStanowiska;
    }

    public void setIdStanowiska(int idStanowiska) {
        this.idStanowiska = idStanowiska;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Set<Pracownik> getPracownik() {
        return pracownik;
    }

    public void setPracownik(Set<Pracownik> pracownik) {
        this.pracownik = pracownik;
    }
}