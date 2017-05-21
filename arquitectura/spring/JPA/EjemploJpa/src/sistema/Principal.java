package sistema;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.Persona;

public class Principal {

    public static void main(String... args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("EjemploJpa");
        insertarPersona(LOG, emf);
        buscarPersonas(LOG, emf);
        emf.close();

    }
    private static final Logger LOG = Logger.getLogger(Principal.class.getName());

    private static void buscarPersonas(Logger LOG, EntityManagerFactory emf) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Persona> q = em.createQuery("select p from Persona p",
                Persona.class);
        List<Persona> todas = q.getResultList();
        todas.forEach(persona -> LOG.log(Level.INFO, "Persona: {0}", persona));
        em.getTransaction().commit();
    }

    private static void insertarPersona(Logger LOG, EntityManagerFactory emf) {
        Persona p = new Persona("Nombre " + System.currentTimeMillis());
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        LOG.log(Level.INFO, "Persona: {0}", p);
        em.getTransaction().commit();
    }
}
