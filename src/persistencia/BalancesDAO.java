package persistencia;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetosNegocio.Balance;

public class BalancesDAO {

    public void agregarBalance(Balance balance) throws SQLException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AbarrotesElPandaPU");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(balance);
        entityManager.getTransaction().commit();
    }

    public boolean actualizarBalance(Balance balance) throws SQLException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AbarrotesElPandaPU");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Balance balance2 = entityManager.find(Balance.class, balance.getId());
        if (balance2 != null) {
            balance2.setCredito(balance.getCredito());
            balance2.setDiferencia(balance.getDiferencia());
            balance2.setEfectivoIngresado(balance.getEfectivoIngresado());
            balance2.setEfectivoRetirado(balance.getEfectivoRetirado());
            balance2.setVaucherIngresado(balance.getVaucherIngresado());
            balance2.setVaucherRetirado(balance.getVaucherRetirado());
            balance2.setFecha(balance.getFecha());
            entityManager.persist(balance2);
            entityManager.getTransaction().commit();
            return true;
        }
        entityManager.getTransaction().commit();
        return false;
    }

    public boolean eliminarBalance(Integer id) throws SQLException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AbarrotesElPandaPU");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Balance balance = entityManager.find(Balance.class, id);
        if (balance != null) {
            entityManager.remove(balance);
            entityManager.getTransaction().commit();
            return true;
        }
        entityManager.getTransaction().commit();
        return false;
    }

    public Balance obtenerBalancePorId(Integer id) throws SQLException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AbarrotesElPandaPU");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Balance balance = entityManager.find(Balance.class, id);
        entityManager.getTransaction().commit();
        return balance;
    }

    public List<Balance> obtenerBalances() throws SQLException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AbarrotesElPandaPU");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        //Crea el consructor de consultas
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        //Se construye el objeto de consulta en si
        criteria.select(criteria.from(Balance.class));
        //Creacion de la consulta lista para ejecutarse
        Query query = entityManager.createQuery(criteria);
        //Ejecucion del query y retorno de resultados.
        List<Balance> balances = query.getResultList();

        entityManager.getTransaction().commit();
        return balances;
    }

}
