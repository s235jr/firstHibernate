package encje;

public class Narzedzia {

    private int idNarzedzia;
    private String typ;
    private String serialNumber;
    private Pracownik pracownik;

    public int getIdNarzedzia() {
        return idNarzedzia;
    }

    public void setIdNarzedzia(int idNarzedzia) {
        this.idNarzedzia = idNarzedzia;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Pracownik getPracownik() {
        return pracownik;
    }

    public void setPracownik(Pracownik pracownik) {
        this.pracownik = pracownik;
    }
}
