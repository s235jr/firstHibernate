import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Hibernate {
    public static void main(String[] args) {

        Configuration conf = new Configuration().configure();
        SessionFactory factory = conf.buildSessionFactory();
        Session s = factory.openSession();
        List l = s.createQuery("SELECT pracownik.Imie FROM Pracownik pracownik WHERE Nazwisko = 'Nowak'").list();
        List m = s.createQuery("SELECT pracownik.Wynagrodzenie FROM Pracownik pracownik").list();
        //String k = s.createQuery("SELECT pracownik.Imie FROM Pracownik pracownik").toString();
        //s.createQuery("UPDATE pracownik SET stawka = 125 WHERE ID = 3");
        //System.out.println(l.size());
        System.out.println(l);
        System.out.println(m);
        //System.out.println(k);




    }
}