package dao;

import model.UserModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;

public class UserDao {
    public void save(UserModel user) throws ServletException {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager         = managerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(user);
        entityManager.getTransaction().commit();

        entityManager.close();
        managerFactory.close();
    }
}
