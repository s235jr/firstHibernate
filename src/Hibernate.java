import encje.Pracownik;
import encje.Stanowisko;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hibernate {
    public static void main(String[] args) {

        Configuration conf = new Configuration().configure();
        SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        List l = session.createQuery("SELECT pracownik.Stanowisko.Stanowisko FROM Pracownik pracownik").list();
        List m = session.createQuery("SELECT pracownik.Nazwisko FROM Pracownik pracownik WHERE Stanowisko ='Spawacz'").list();
        //List m = session.createQuery("SELECT pracownik.Nazwisko FROM Pracownik pracownik WHERE Wynagrodzenie > 3000").list();
        //List p = session.createQuery("SELECT pracownik.Nazwisko FROM Pracownik pracownik WHERE Stanowisko = 'Spawacz'").list();
        //System.out.println(l.size());
        System.out.println(l);
        //System.out.println(p);
        System.out.println(m);
        //Transaction transaction = session.beginTransaction();
        //Stanowisko stanowisko = new Stanowisko();
        //stanowisko.setStanowisko("Prezes");
        //stanowisko.setOpis("Prezes zarządu");

        /*Set<Pracownik> zbior = new HashSet<Pracownik>();
        Pracownik pracownik = new Pracownik();
        pracownik.setImie("Wojciech");
        pracownik.setNazwisko("Kowal");
        pracownik.setStawka(24);
        pracownik.setIlosc_godzin(240);*/

        //zbior.add(pracownik);
        //stanowisko.setPracownik();
        //pracownik.setStanowisko();
        //session.persist(pracownik);
        //transaction.commit();

    }
}