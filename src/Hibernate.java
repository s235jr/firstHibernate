import encje.Adres;
import encje.Pracownik;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate {
    public static void main(String[] args) {

        Configuration conf = new Configuration().configure();
        SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
//        List l = session.createQuery("SELECT pracownik.stanowisko FROM Pracownik pracownik").list();
//        List m = session.createQuery("SELECT pracownik.nazwisko FROM Pracownik pracownik WHERE stanowisko ='Spawacz'").list();
//        List m = session.createQuery("SELECT pracownik.Nazwisko FROM Pracownik pracownik WHERE Wynagrodzenie > 3000").list();
//        List p = session.createQuery("SELECT pracownik.Nazwisko FROM Pracownik pracownik WHERE Stanowisko = 'Spawacz'").list();
        Transaction transaction = session.beginTransaction();

//        Stanowisko stanowisko = new Stanowisko();
//        stanowisko.setNazwa("Spawacz");
//        stanowisko.setOpis("prace spawalnicze");
//        Set<Pracownik> zbior = new HashSet<Pracownik>();
//        Pracownik pracownik = new Pracownik();
//        pracownik.setImie("Heniek");
//        pracownik.setNazwisko("Kowalski");
//        pracownik.setStanowisko(stanowisko);
//        zbior.add(pracownik);
//        stanowisko.setPracownik(zbior);
//        session.persist(stanowisko);
//        transaction.commit();

//        Stanowisko stanowisko = new Stanowisko();
//        stanowisko.setNazwa("Tokarz");
//        stanowisko.setOpis("prace tokarskie");
//
//        Set<Narzedzia> zbiorNarzedzi = new HashSet<Narzedzia>();
//        Narzedzia narzedzia = new Narzedzia();
//        narzedzia.setTyp("Nóż tokarski");
//        narzedzia.setSerialNumber("5354-456");
//        zbiorNarzedzi.add(narzedzia);
//
//        Set<Pracownik> zbiorPracownikow = new HashSet<Pracownik>();
//        Pracownik pracownik = new Pracownik();
//        pracownik.setImie("Waldek");
//        pracownik.setNazwisko("Okrągły");
//        pracownik.setNarzedzia(zbiorNarzedzi);
//
//        zbiorPracownikow.add(pracownik);
//        stanowisko.setPracownik(zbiorPracownikow);
//        session.persist(stanowisko);
//        transaction.commit();

//        pracownik = session.get(Pracownik.class, 10);
//        System.out.println(pracownik.getImie() + " " + pracownik.getNazwisko());
//        stanowisko = session.get(Stanowisko.class, 6);
//        System.out.println(stanowisko.getNazwa());
//        System.out.println(stanowisko.getPracownik().iterator().next().getImie() + " " + stanowisko.getPracownik().iterator().next().getNazwisko() + " " + stanowisko.getNazwa());

        Pracownik pracownik2 = new Pracownik();
        pracownik2.setImie("Zdzisław");
        pracownik2.setNazwisko("Chrobry");

        Adres adres = new Adres();
        adres.setMiasto("Warszawa");
        adres.setUlica("Marszałkowska");
        adres.setNumerDomu(15);

        pracownik2.setAdres(adres);
        adres.setPracownik(pracownik2);
        session.persist(pracownik2);
        transaction.commit();
    }
}