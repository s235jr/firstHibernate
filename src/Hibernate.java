import encje.Pracownik;
import encje.Stanowisko;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class Hibernate {
    public static void main(String[] args) {

        Configuration conf = new Configuration().configure();
        SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        //List l = session.createQuery("SELECT pracownik.stanowisko FROM Pracownik pracownik").list();
        //List m = session.createQuery("SELECT pracownik.nazwisko FROM Pracownik pracownik WHERE stanowisko ='Spawacz'").list();
        //List m = session.createQuery("SELECT pracownik.Nazwisko FROM Pracownik pracownik WHERE Wynagrodzenie > 3000").list();
        //List p = session.createQuery("SELECT pracownik.Nazwisko FROM Pracownik pracownik WHERE Stanowisko = 'Spawacz'").list();
        //System.out.println(l.size());
        //System.out.println(l);
        //System.out.println(p);
        //System.out.println(m);
        Transaction transaction = session.beginTransaction();

        /*Stanowisko stanowisko = new Stanowisko();
        stanowisko.setNazwa("Spawacz");
        stanowisko.setOpis("prace spawalnicze");
        Set<Pracownik> zbior = new HashSet<Pracownik>();
        Pracownik pracownik = new Pracownik();
        pracownik.setImie("Heniek");
        pracownik.setNazwisko("Kowalski");
        pracownik.setStanowisko(stanowisko);
        zbior.add(pracownik);
        stanowisko.setPracownik(zbior);
        session.persist(stanowisko);
        transaction.commit();*/

        Pracownik pracownik = session.get(Pracownik.class, 10);
        System.out.println(pracownik.getImie() + " " + pracownik.getNazwisko());
        Stanowisko stanowisko = session.get(Stanowisko.class, 6);
        System.out.println(stanowisko.getNazwa());
        System.out.println(stanowisko.getPracownik().iterator().next().getImie() + " " + stanowisko.getPracownik().iterator().next().getNazwisko() + " " + stanowisko.getNazwa());


    }
}