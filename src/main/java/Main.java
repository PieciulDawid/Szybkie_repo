import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main (String arg[]){


        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setAuthorID("test");
        authorEntity.setFName("Imię");
        authorEntity.setLName("Nazwis");

        Configuration con = new Configuration().configure().addAnnotatedClass(AuthorEntity.class);

        SessionFactory sessionFactory = con.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(authorEntity);

        transaction.commit();

        session.close();
    }
}
