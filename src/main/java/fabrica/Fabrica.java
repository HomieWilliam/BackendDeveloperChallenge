package fabrica;

import org.apache.deltaspike.jpa.api.entitymanager.PersistenceUnitName;

import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@ApplicationScoped
public class Fabrica {
    @Inject
    @PersistenceUnitName("challenge-unit")
    private EntityManagerFactory emf;

    @Produces
    @Default
    public EntityManager create()
    {
        return emf.createEntityManager();
    }

    public void close(@Disposes EntityManager em)
    {
        if (em.isOpen())
        {
            em.close();
        }
    }

    @PreDestroy
    public void closeFactory() {
        if(emf.isOpen()) {
            emf.close();
        }
    }
}
